package ru.job4j.anime;

import java.util.Arrays;

public class Anomalyy {
    public static int[][] foundd( int[] data ,int up ,int down ) {
        int[][] result = new int[data.length][];
        int[] temp = new int[data.length];
        int count = 0; //количество аномалий в строке
        int index = 0; //считаем элементы временного массива
        int m = 0;//
        int k = 0;//количество аномалий, записанных в temp
        boolean flag = false;

        for(int i = 0; i < data.length; i++) {
            if (data[i] < up && data[i] > down) {
                flag = true;
            } else {
                flag = false;
                temp[index] = i;
                index++;
                k++;
            }
            if ((flag && k > 0) || (i == data.length - 1 && k > 0)) {
                result[count] = new int[ 2 ];
                count++;
                switch (k) {
                    case 1:
                        result[ m ][ 0 ]  = temp[ 0 ];
                        result[ m ][ 1 ] = temp[ 0 ];
                        m++;
                        break;
                    default:
                        result[ m ][ 0 ] = temp[ 0 ];
                        result[ m ][ 1 ] = temp[k - 1];
                        m++;
                        break;
                }
                Arrays.fill(temp, 0);
                index = 0;
                k = 0;
            }
        }
       /** if (k > 0) {
            result[count] = new int[ 2 ];
            count++;
            switch (k) {
                case 1:
                    result[ m ][ 0 ] = temp[ 0 ];
                    result[ m ][ 1 ] = temp[ 0 ];
                    m++;
                    break;
                default:
                    result[ m ][ 0 ] = temp[ 0 ];
                    result[ m ][ 1 ] = temp[k - 1];
                    m++;
                    break;
            }
            Arrays.fill(temp, 0);
        }*/
        return Arrays.copyOf (result, count);
    }
}

