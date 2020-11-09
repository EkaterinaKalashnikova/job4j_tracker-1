package ru.job4j.anime;

import java.util.Arrays;

public class CheckSumIndex {
    public static int[] collectNewArray(int[][] data, int sum) {

        int[] result = new int[data.length * data.length];
        int count = 0; // посчитать количество 0 в двумерном массиве
        int index = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[ i ].length; j++) {
                if (i + j == sum) {
                    data[ i ][ j ] = 0;
                    count++;
                }
                if (data[i][j] != 0) {
                  result[index] = data[i][j];
                  index++;
                }
            }
        }
        return Arrays.copyOf (result, result.length - count);
    }
}
