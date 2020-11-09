package ru.job4j.anime;

public class WordsToText {
    public static String convert(String[] words) {
        String result = " ";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i ++) {
            if (i > 0) {
                sb.append(result);
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
