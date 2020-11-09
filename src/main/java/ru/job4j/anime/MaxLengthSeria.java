package ru.job4j.anime;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int scount = 0;
        for(int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[ i ] && array[i - 1] <= array[array.length - i - 1]) {
                count++;
                if (scount < count) {
                    scount = count;
                } else {
                    count = 1;
                }
            }
        }
        return Math.max(count, scount);
    }
}
