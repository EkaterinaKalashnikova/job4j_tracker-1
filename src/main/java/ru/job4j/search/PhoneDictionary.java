package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList <Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
      /**  Predicate <Person> combine = ...;
        ArrayList<Person> result = new ArrayList<>();
        for(Person persons : persons) {
            if(combine.test(persons)) {
                result.add(persons);
            }
        }
        return result;*/
      return null;
    }
}
