package ru.job4j.list;

import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
//      List<String> list1 = new ArrayList<>();
//        for(String str : list) {
//            if (str.length() == 5) {
//                list1.add(str);
//
            list.removeIf(p -> p.length() < 5);

        return list;
    }
}
