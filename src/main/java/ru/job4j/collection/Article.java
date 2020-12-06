package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String regex = "\\p{P}";
        Set<String> set = new HashSet<>(Arrays.asList(origin.replaceAll(regex, "").split(" ")));
        for (String txt : line.replaceAll(regex, "").split(" ")) {
            if (!set.contains(txt)) {
                return false;
            }
        }
        return true;
    }
}
