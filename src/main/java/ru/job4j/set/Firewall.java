package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        boolean flag = false;
        String text1 = "Вы сделали правильный выбор!";
        String text2 = "Выберите другую статью...";
       String[] strings = s.split(" ");
        for(String str : words) {
            for(int i = 0; i < strings.length; i++) {
                if (strings[i].equals(str)) {
                   flag = true;
                }
            }
         }
        return flag? text2 : text1;
    }
}
