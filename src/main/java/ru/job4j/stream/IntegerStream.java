package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 0, -44, 777, 1, -1, 12, 1, -3);
        List<Integer> filtered = list.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}
