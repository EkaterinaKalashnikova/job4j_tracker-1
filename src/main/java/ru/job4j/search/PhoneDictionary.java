package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList <Person> persons = new ArrayList <Person>();

    public void add( Person person ) {
        this.persons.add(person);
    }

    public ArrayList <Person> find(String key) {
        Predicate <Person> combine1 = person -> persons.contains(key);
        Predicate <Person> combine2 = person -> persons.contains(person);
        Predicate <Person> combine = combine1.or(combine2);
        ArrayList <Person> result = new ArrayList <>();
        for(Person person : persons) {
            if (combine.test(person)){
                result.add(person);
            }
        }
        return result;
    }
}
