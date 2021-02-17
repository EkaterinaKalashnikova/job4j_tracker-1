package ru.job4j.list;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List <String> list, String el) {
        int countOne = 0, countTwo = 0;
        boolean flagOne = false;
        boolean flagTwo = false;

        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(el) && !flagOne) {
                countOne = i;
                flagOne = true;
            }
            if (list.get(i).equals(el) && flagOne) {
                 countTwo = i;
                 flagTwo = true;
            }
        }
        if (flagOne && flagTwo) {
            return list.subList(countOne, countTwo);
        }
        return null;
    }
}

/*  int countOne = -1;
    int countTwo = -1;

        for(int i = 0; i < list.size (); i++) {
            if (list.get(i).equals(el) && countOne < 0 ) {
                countOne = i;
            }
            if (list.get(i).equals(el) && countOne > 0) {
                 countTwo = i;
            }
        }
        if (countOne != -1 && countTwo != -1) {
            return list.subList(countOne, countTwo);
        }
        return null;*/
