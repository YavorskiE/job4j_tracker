package ru.job4j.collection;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Integer first = 1;
        Integer second = 33;
        int rsl = first.compareTo(second);
        System.out.println(rsl);

        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);

        List<Integer> lst = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(lst);
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println(lst);
    }
}