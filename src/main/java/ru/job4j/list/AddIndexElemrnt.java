package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElemrnt {
    public static boolean addNewElement( List <String> list,int index,String str) {
        List<String> check = new ArrayList <> (list);
        if (list.size () < check.size ()) {
            list.add(index ,str);
        }
        return list.contains(str) ? false : true;
    }
}
