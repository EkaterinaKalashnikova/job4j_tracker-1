package ru.job4j.anime;


public class MergeRows {
    public static int[] merge(int[][] data) {
        int n = data.length * data.length;
        int[] result = new int[n];

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
                int count = data.length;
               // count++;
                result[i * count  + j] = data[i][j];
               // result[i * 3  + j] = data[i][j];
             // result[i + j ] = data[j][i];
            }
        }
        return result;
    }
}

