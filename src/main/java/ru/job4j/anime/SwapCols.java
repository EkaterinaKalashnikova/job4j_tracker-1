package ru.job4j.anime;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {

        for(int i = 0; i < data.length; i ++) {
            for(int j = 0; j < data[i].length; j ++) {
               // System.out.print(data[i][j] + "	");
            }
          //  System.out.println();
        }
        int col1 = 0;
        int col2 = 2;
        for(int i = 0; i < data[col2].length; i++) {
            int tmp = data[i][col1];
            data[i][col1] = data[i][col2];
            data[i][col2] = tmp;
        }
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
             //   System.out.print(data[i][j] + "	");
            }
         //   System.out.println();
        }
    }
}
