package ru.job4j.anime;

public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean flag = false;

        for(int i = 0; i < ints.length; i ++) {
            if (num % ints[i] == 0) {
                flag = true;
            } else flag = false;
        }
        return flag;
    }
}
