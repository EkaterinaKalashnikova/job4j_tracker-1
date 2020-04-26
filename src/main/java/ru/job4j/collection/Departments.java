package ru.job4j.collection;

import javax.xml.namespace.QName;
import java.util.*;

public class Departments {

    private final  Comparator<String> comparator;

    public Departments(Comparator <String> comparator) {
        this.comparator = comparator;
    }

    public Comparator <String> getComparator() {
        return comparator;
    }

    public static List<String> fillGaps( List <String> deps ) {
        List <String> rsl = new ArrayList<>();
        String[] dep = rsl.toArray(new String[ 0 ]);
        HashSet <String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
              if (deps.indexOf(el) < deps.size() - 1) {
                  tmp.add(start + "/" + el);
                   }
                }
            }

        return new ArrayList<>(tmp);
    }

    private static Comparator<List<String>> acsOrDescComp(int i) {
        return null;
    }

    public static void sortAsc(List <List <String>> orgs) {
        Comparator<List<String>> comparator = acsOrDescComp(1);
        orgs.sort(comparator);
    }

    public static void sortDesc(List <List <String>> orgs) {
        Comparator<List<String>> comparator = acsOrDescComp(-1);
        orgs.sort(comparator);
    }
}


