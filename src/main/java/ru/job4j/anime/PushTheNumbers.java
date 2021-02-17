package ru.job4j.anime;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int i = array.length - 1;

        while(i > 0) {
            if((row - i) >= 0 ) {
                array[row - i][column] = array[row - i + 1][column];
            }
            if((column - i) >= 0 ) {
                array[row][column - i] = array[row][column - i + 1];
            }
            if ((row + i) <= (array.length - 1)) {
                array[row + i][column] = array[row + i - 1][column];
            }
            if((column + i) <= (array.length - 1)) {
                array[row][column + i] = array[row][column + i - 1];
            }
            i--;
        }
        array[row][column] = 0;
    }

  /**  for(int i = array.length - 1; i > 0; i--) {
        if((row - i) >= 0 ) {
            array[row - i][column] = array[row - i + 1][column];
        }
        if((column - i) >= 0 ) {
            array[row][column - i] = array[row][column - i + 1];
        }
        if ((row + i) <= (array.length - 1)) {
            array[row + i][column] = array[row + i - 1][column];
        }
        if((column + i) <= (array.length - 1)) {
            array[row][column + i] = array[row][column + i - 1];
        }
    }
    array[row][column] = 0;*/
}




