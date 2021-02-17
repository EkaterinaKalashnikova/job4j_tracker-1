package ru.job4j.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddElement {
    public static boolean addNewElement( List <String> list,String str) {
        List<String> check = new ArrayList <> (list);
        Collections.sort(list);
        Collections.sort(check);

        return list.equals(check);
    }
}

