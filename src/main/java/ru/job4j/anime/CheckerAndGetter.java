package ru.job4j.anime;

import java.util.List;

public class CheckerAndGetter {
    public static String getElement( List <String> list ) {
        String firstElement = "";
        if (!list.isEmpty()) {
            firstElement = list.get (0);
        }
        return firstElement;
    }
}


/**
 * Iterator <String> iterator = list.iterator();
 * while (iterator.hasNext()) {
 * String element = iterator.next();
 * if (list.isEmpty()) {
 * return element;
 * }
 * }
 */