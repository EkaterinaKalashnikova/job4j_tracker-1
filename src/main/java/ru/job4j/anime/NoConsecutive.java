package ru.job4j.anime;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        if (data.length == 0) {
            return result;
        }
        for(int i = 0; i < data.length - 1; i ++) {
            if ((data[i + 1] - data[i]) > 1) {
                result = data[i + 1];
            }
        }
        return result;
    }
}
