package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNum = left.split("\\.");
        String[] rightNum = right.split("\\.");
        return Integer.compare(Integer.valueOf(leftNum[0]), Integer.valueOf(rightNum[0]));
    }
}