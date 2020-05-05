package ru.job4j.collection;

import java.util.Comparator;

public class DepDeskComp implements Comparator <String> {
    @Override
    public int compare(String o1, String o2) {
        int tmp = o2.split ("/") [0] .compareTo (o1.split ("/") [0]); //сравнение до первого слэша
        return tmp != 0 ? tmp: o1.compareTo (o2); //сравнение в лексиграфическом порядке
        }
    }


