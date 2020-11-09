package ru.job4j.anime;

public class Haming {
    public static int checkStrings(String left, String right) {
        if(left.length() != right.length()) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < left.length() ; i ++) {
            if(left.charAt(i) != right.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
