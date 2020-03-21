package ru.job4j.collection;

import java.util.Comparator;

public class StringCharCompare implements Comparator<String> {
    private int index;

    public StringCharCompare( int index ) {
        this.index=index;
    }

    @Override
    public int compare( String left ,String right ) {
        if (left.charAt(index) < right.charAt(index)) {
            return -1;
        } else if (left.charAt(index) == right.charAt(index)) {
            return 0;
        } else {
            return 1;
        }
    }
}
