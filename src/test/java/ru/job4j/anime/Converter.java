package ru.job4j.anime;

public class Converter {
    public static int[][] convertInSquareArray( int[][] array ) {
        int index = 0;
        int size = 0;
        int row = 0, col = 0;
        for(int i = 0; i < array.length; i++) {
            index = index + array[ i ].length;
        }
        size = size + (int) Math.ceil (Math.sqrt (index));
        int[][] result  = new int[ size ][ size ];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[ i ].length; j++) {
                result[ row ][ col ] = array[ i ][ j ];
                col++;
                if (col == size) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }
}
