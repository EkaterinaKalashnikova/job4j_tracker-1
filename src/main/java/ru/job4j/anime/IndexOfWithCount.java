package ru.job4j.anime;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int index = -1;
        for(int i = number; i < string.length; i++) {
           if (string[i] == c) {
               index = i;
               break;
           }
           else if(number >= 2) {
               i++;
           }
        }
        return index;
    }
}
