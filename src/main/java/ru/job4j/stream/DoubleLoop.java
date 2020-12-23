package ru.job4j.stream;

import java.util.stream.Stream;

public class DoubleLoop {

    public static void main(String[] args) {
        String[] levels = {"Level_1", "Level_2", "Level_3"};
        String[] tasks = {"Task_1", "Task_2", "Task_3", "Task_4"};
        Stream.of(levels)
                .flatMap(level -> Stream.of(tasks)
                        .map(task -> level + " " + task))
                .forEach(System.out::println);
    }
}
