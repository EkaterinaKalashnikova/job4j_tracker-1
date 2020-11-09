package ru.job4j.anime;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
       int n = data.length;
      int[] res = new int[n] ;

        for(int i = 0; i < data.length; i ++) {
            res[i]  = data[i][n - i - 1];
           }
        return res;
    }
}
