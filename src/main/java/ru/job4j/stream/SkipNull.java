package ru.job4j.stream;

import java.util.stream.Stream;

public class SkipNull {
    public static void main(String[] args) {
        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(t -> String.format(" %s", t))
                .forEach(System.out::print);
    }
}
