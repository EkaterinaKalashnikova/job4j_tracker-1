package ru.job4j.anime;

public class Simmetry {
    public static boolean check(int i) {
        String str = Integer.toString(i);
        for (int n = 0, j = str.length() - 1; n < j; n++, j--) {
            if (str.charAt(n) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
