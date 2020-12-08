package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/", 2);
        String[] s2 = o2.split("/", 2);
        int rsl = s2[0].compareTo(s1[0]);
        if (rsl == 0) {
            rsl = Integer.compare(s1.length, s2.length);
            if (rsl == 0) {
                rsl = s1[1].compareTo(s2[1]);
            }
        }
        return rsl;
    }
}