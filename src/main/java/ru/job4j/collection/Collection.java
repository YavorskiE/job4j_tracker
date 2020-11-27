package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        Set<Integer> numberss = new TreeSet<>(Collections.reverseOrder());
        numberss.add(5);
        numberss.add(1);
        numberss.add(3);
        System.out.println(numberss);
    }
}
