package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine1 = person -> person.getName().equals(key);
        Predicate<Person> combine2 = person -> person.getSurname().equals(key);
        Predicate<Person> combine3 = person -> person.getPhone().equals(key);
        Predicate<Person> combine4 = person -> person.getAddress().equals(key);
        Predicate<Person> combine = combine1.or(combine2).or(combine3).or(combine4);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
