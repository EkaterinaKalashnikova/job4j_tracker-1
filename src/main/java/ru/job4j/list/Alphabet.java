package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList(s.split(""));
        Collections.sort(list, stComparator);

     /*  for(int i = 0; i < list.size(); i  ++) {
            System.out.println (list.get(i));
        }*/

       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

   public static Comparator<String> stComparator = new Comparator<String>() {

       @Override
       public int compare(String e1, String e2) {
           return  e1.compareTo(e2);
       }
   };
}


