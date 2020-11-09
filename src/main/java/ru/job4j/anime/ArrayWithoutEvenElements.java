package ru.job4j.anime;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] result = new int[data.length];
        int index = 0;
        int count = 0;
        for(int datum : data) {
            if ( datum % 2 == 0 ){
                continue;
            }
            result[ index ] = datum;
            index++;
            count++;
        }
        return Arrays.copyOf (result, count);
    }
}
