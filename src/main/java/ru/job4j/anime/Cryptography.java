package ru.job4j.anime;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length() - 4; i ++) {
            sb.setCharAt(i, '#');
        }
        if (s.isEmpty()) {
            System.out.print("empty");
            return "empty";
        } else if (s.indexOf(s,0) > 4) {
            return s;
        }
        return sb.toString();
    }
}
