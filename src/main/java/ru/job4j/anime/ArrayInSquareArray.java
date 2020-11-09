package ru.job4j.anime;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] result = new int[size][size];
        int index = 0;
        for(int i = 0; i < size; i ++) {
            for(int j = 0; j < size; j ++) {
                if (index < array.length) {
                    result[ i ][ j ]=array[ index ];
                    index++;
                }else break;
            }
        }
        return result;
    }
}
