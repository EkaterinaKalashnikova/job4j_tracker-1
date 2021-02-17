package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class SplitterList {
    public static List <String> split( List<String> left, List<String> middle, List<String> right) {
     List<String> result = new ArrayList<>();
        for(int i = 0; i < left.size(); i ++) {
            for(int j = 0; j < right.size(); j++) {
               if (left.get(i).equals(right.get(j))) {
                   left.remove(i);
               }
            }
        }
       // result.addAll(left);
       // result.retainAll(middle);

        for(int i = 0; i < left.size(); i++) {
            for(int j = 0; j < middle.size(); j++) {
                if (left.get(i).equals(middle.get(j))) {
                   // result.retainAll(middle);
                    result.add(middle.get(j));
                }
            }
        }
        return result;
    }
}
