package ru.job4j.set;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        // list = new ArrayList<>();
        String[] list =s.split("");

        Set<String> setList = new HashSet<>();
        for(String str : list) {
            if (!str.equals(" ")) {
                setList.add(str);
            }
        }
       //  int count = setList.size();
      //  return (setList.size() == 26)? true : false;
        return setList.size() == 26;
    }
}
