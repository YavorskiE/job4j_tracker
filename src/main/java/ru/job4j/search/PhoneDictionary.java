package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var combine = ((Predicate<Person>) person -> person.getName().contains(key))
                .or(person -> person.getSurname().contains(key))
                .or(person -> person.getPhone().contains(key))
                .or(person -> person.getAddress().contains(key));
        var result = new ArrayList<Person>();
        for (var person: persons) {
//            if (person.getName().contains(key) || person.getSurname().contains(key)
//                    || person.getPhone().contains(key) || person.getAddress().contains(key)) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}
