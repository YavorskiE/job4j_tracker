package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(matrix.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
        );
        Integer[][] array = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 8, 9}
        };
        System.out.println(Stream.of(array)
                .flatMap(Stream::of)
                .collect(Collectors.toList())
        );
    }
}
