package ru.job4j.anime;

public class PositiveOrNegative {
    public static boolean check( int[] data ) {
        int i=0;
        int neg = 0;
        int pos = 0;
        boolean checkN = false;
        boolean checkP = false;

        while(i < data.length) {
            if (data[ i ] > 0) {
                pos++;
                i++;
            } else if (data[ i ] < 0) {
                neg++;
                i++;
            }
            else i++;
        }
        if (neg % 2 != 0) {
            checkN = true;
        }
        if (pos % 2 != 0) {
            checkP = true;
        }
       return checkN && checkP;
        //return false;
    }
}
