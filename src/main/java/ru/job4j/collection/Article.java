package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String regex = "[ ,.;:!?]";
        Set<String> originSet = new HashSet<>(Arrays.asList(origin.split(regex)));
        Set<String> lineSet = new HashSet<>(Arrays.asList(line.split(regex)));
        return originSet.containsAll(lineSet);
    }
}