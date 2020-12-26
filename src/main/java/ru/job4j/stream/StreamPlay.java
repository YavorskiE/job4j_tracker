package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamPlay {
    public static void main(String[] args) {
        List.of(5, 1, 2).forEach(System.out::print);
        Set.of(5, 1, 2).forEach(System.out::print);
        Map.of("first", 1, "second", 2)
                .forEach((v, k) -> System.out.printf("%s %s", v, k));
    }
}
