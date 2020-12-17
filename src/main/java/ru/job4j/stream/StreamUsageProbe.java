package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsageProbe {
    public static class Task0 {
        private final String name;
        private final long spent;

        public Task0(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }

    public static void main(String[] args) {
        List<Task0> task0s = List.of(
                new Task0("Bug #1",  100),
                new Task0("Task #2", 100),
                new Task0("Bug #3", 100)
        );
        List<Task0> bugs = task0s.stream()
                .filter(task0 -> task0.name.contains("Bug"))
                .collect(Collectors.toList());
        bugs.forEach(System.out::println);
        List<String> names = task0s.stream()
                .map(task0 -> task0.name)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
        long total = task0s.stream()
                .map(task0 -> task0.spent)
                .reduce(0L, Long::sum);
        System.out.println(total);
    }
}