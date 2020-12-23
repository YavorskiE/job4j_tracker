package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPlay {
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .filter(student -> student.getScore() > bound)
                .collect(Collectors.toList());
//        Function<Student, Stream<Student>> function = new Function<Student, Stream<Student>>() {
//            @Override
//            public Stream<Student> apply(Student student) {
//                return Stream.ofNullable(student);
//            }
//        }
//        Stream<Student> stdStream = students.stream();
//        Stream<Student> nulStream = stdStream.flatMap(Stream::ofNullable);
//        Stream<Student> nulStream = stdStream.flatMap(s -> Stream.ofNullable(s));
//        Stream<Student> nulStream = stdStream.flatMap(function);
//        Stream<Student> sortedStream = nulStream.sorted();
//        Stream<Student> filteredStream = sortedStream.filter(s -> s.getScore() >= bound);
//        List<Student> rsl = filteredStream.collect(Collectors.toList());
//        return rsl;
    }
}
