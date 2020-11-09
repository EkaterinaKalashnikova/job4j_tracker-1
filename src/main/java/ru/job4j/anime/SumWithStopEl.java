package ru.job4j.anime;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
       int sum = 0;
        for(int i = 0; i < data.length; i ++) {
            if (i < el) {
              sum = sum + i;
            } else if ( sum % 2 != 0) {
                return 0;
            }
        }
        return sum;
    }
}
