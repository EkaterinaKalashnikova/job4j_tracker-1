package ru.job4j.collection;

import java.util.Comparator;

public class CharacterCompare implements Comparator <Character> {
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




