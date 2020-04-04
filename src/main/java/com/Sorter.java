package com;

import ru.jobj4.bank.User; // добавляем импорт пользовательского класса
import java.util.*;
/**
 * Class
 * @author Petr
 * @since
 * @version
 */
public class Sorter {

    public Sorter() {
    }

    Set<User> sort(List<User> list) {
        TreeSet<User> sortedList = new TreeSet<>();
        sortedList.addAll(list);
        return sortedList;
    }

    List<User> sortable(List <User> list) { //rename
        Comparator<User> compare = new Comparator<User>() { //rename
            @Override
            public int compare (User o1, User o2) {
                return o1.getUsername().length() - o2.getUsername().length();
            }
        };
        list.sort(compare);
        return list;
    }

    List<User> sorbets(List <User> list) { //rename
        Comparator<User> comp1 = new Comparator<User>() {
            @Override
            public int compare (User o1, User o2) {
                return o1.getPassport().compareTo(o2.getPassport());
            }
        };
        Comparator<User> comp2 = new Comparator<User>() {
            @Override
            public int compare (User o1, User o2) {
                return o1.getUsername().compareTo(o2.getUsername());
                // сортируем пользовательские имена
            }
        };
        list.sort(comp1.thenComparing(comp2));
        return list;
    }
}