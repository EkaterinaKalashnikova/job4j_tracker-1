package ru.job4j.anime;

public class EditorElementArray {
    public static int[][] changeData(int[][] array, int el) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length ; j++) {
                if (array[i][j] > el) {
                    array[i][j] = array[i][j] - el;
                } else  {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
