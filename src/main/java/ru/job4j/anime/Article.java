package ru.job4j.anime;

import java.util.HashSet;

public class Article {

    /**
     * List <String> listStart = Arrays.asList(origin.split("[,:.!\\s]+"));
     * String[] array = line.split("[,;:.!?\\s]+");
     * for(var word : array) {
     * if (!( listStart.contains(word))) {
     * return false;
     * }
     * }
     * return true;
     * }
     * }
     */

    public static boolean generateBy( String origin ,String line ) {
        String[] wordStart=origin.split(" ");
        String[] wordEnd=line.split(" ");
        //Set <String> set = new HashSet <String>(Arrays.asList(wordStart));
        HashSet <String> set=new HashSet <>();
        for(String word : wordStart) {
            set.add(word
                    .replace("," ," ")
                    .replace("." ," ")
                    .replace("!" ," "));
        }
        for(String s : wordEnd) {
            if ( !set.contains(s) ){
                return false;
            }
        }
        return true;
    }
}

