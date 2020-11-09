package ru.job4j.anime;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff( int[] left, int[] right ) {
        int[] merge = new int[left.length + right.length];
        int k = 0;
        boolean equal = true;
        if ((right.length == 0 && right.length == 0) || (left.length == 0)) {
        }
        if (right.length == 0) {
            for(int i = 0; i < left.length; i++) {
                merge[ k ] = left[ i ];
                k++;
            }
        } else if (right.length != 0 && left.length != 0) {
            for(int i = 0; i < left.length; i++) {
                for(int j = 0; j < right.length; j++) {
                    if (left[ i ] == right[ j ]){
                            equal = false;
                        }
                    }
                    if (equal) {
                        merge[ k ] = left[ i ];
                        k++;
                    } else {
                        equal = true;
                    }
                }
            }
        return Arrays.copyOf (merge, k);
    }
}
