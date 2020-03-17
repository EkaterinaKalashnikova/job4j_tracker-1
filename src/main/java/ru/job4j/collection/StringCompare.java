package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare( String left ,String right ) {
        return left.compareTo(right);
    }

    class CharacterCompare implements Comparator<Character> {
        @Override
        public int compare( Character left ,Character right ) {
            if ( left > right ){
                return 1;
            } else if ( left < right ){
                return -1;
            } else if ( left == right ){
                return 0;
            }
            return Character.compare(left ,right);
        }
    }
}
