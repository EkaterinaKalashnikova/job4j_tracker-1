package ru.job4j.anime;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[ str.length / 2 ][];
        int commonCount = 1;
        int count = 1, index = 0, row = 0;
        boolean flag = false;
        for(int i = 0; i < str.length; i ++) {
            if (str[i] == c) {
                continue;
            } else if (str[i + 1] != c) { //проверяем, что следующий не пробел
               count++;
            } else {
                result[row++] = new char[count];
                commonCount++;
                count = 1; //считать заново количество элементов
            }
            if(i + 1 == str.length - 1) {
                result[row] = new char[count];
                break;
            }
        }
        for(int j = 0; j < result.length; j++) {
            for(int k = 0; k < result[j].length; k++) {
                if (str[index] == c) {
                    index++;
                }
               result[j][k] = str[index];
               index++;
               if(index == str.length) {
                   flag = true;
                   break;
               }
            }
            if ( flag ) {
               break;
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}




