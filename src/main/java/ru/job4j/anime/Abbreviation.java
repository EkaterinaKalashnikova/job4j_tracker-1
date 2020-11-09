package ru.job4j.anime;

public class Abbreviation {
    public static String collect(String s) {
         StringBuffer sb = new StringBuffer();
         sb.append(s.charAt(0)) ;
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == ' ') {
                sb.append(s.charAt(i + 1));
            }
        }
        return sb.toString();
    }
}
