package ru.job4j.anime;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int index = 0;
        for(int i : data) {
            if (i == value) {
               index++;
            }
        }
        return index <= data.length/2;
    }
}
