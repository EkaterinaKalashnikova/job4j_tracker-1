package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        String[] data = s.split("");
        Set <String> set = new HashSet<>(Arrays.asList(data));
        if (s.length () == set.size()) {
            return true;
        } else {
            return false;

        }
    }
}
