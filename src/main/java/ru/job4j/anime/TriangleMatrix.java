package ru.job4j.anime;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[ count ][ ];
        int num = 1;
        for(int i = 0; i < count; i++) {
            triangle[ i ] = new int[i + 1];
            for(int j = 0; j < i + 1; j++) {
                triangle[i][j] = num++;
            }
        }
        return triangle;
    }
}
