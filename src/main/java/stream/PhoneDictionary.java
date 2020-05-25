package stream;

import ru.job4j.search.Person;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList <Person> persons=new ArrayList<Person>();

    public void add( Person person ) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public ArrayList<Person> find( String key ) {
        ArrayList<Person> result = new ArrayList<>();
        //result.stream().filter(person -> result.contains(searchString) == person.equals(key)).forEach(result::add);
        for(var person : persons) {
            if ( person.getAddress().contains(key)
                    ||person.getName().contains(key)
                    ||person.getPhone().contains(key)
                    ||person.getSurname().contains(key)){
                result.add(person);
            }
        }
        return  result;
    }
}
