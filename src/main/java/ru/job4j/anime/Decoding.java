package ru.job4j.anime;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] data = new int[ints.length];
        int temp = 0;
        for(int i = 0; i < ints.length; i++) {
            temp = ints[ i ] % number;
            data[ i ] = temp;
        }
        return data;
    }
}
