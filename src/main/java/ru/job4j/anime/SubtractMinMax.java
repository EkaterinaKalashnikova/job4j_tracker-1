package ru.job4j.anime;

public class SubtractMinMax {
    public static int calculate( int[] ints ) {
        int min = ints[ 0 ];
        int max = ints[ 1 ];
        int j = 1;

        //for(int i = 0; i < ints.length-1; i++) {
           // j = 1;
            while(j < ints.length) {
                if (min < ints[ j ] && ints[ j ] > max) {
                    max = ints[ j ];
                }
                else if (ints[ j ] < min && ints[ j ] < max) {
                    min = ints[ j ];
                }
                j++;
            }
        return max - min;
    }
}
