package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet <String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                // tmp.add start + "/" + el
            }
        }
        return new ArrayList<>(tmp);
    }
    // List<String> rsl = new ArrayList<>();
    // return rsl;

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
