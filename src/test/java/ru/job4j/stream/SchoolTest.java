package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students.add(new Student(10, "Student 1"));
        students.add(new Student(20, "Student 2"));
        students.add(new Student(30, "Student 3"));
        students.add(new Student(40, "Student 4"));
        students.add(new Student(50, "Student 5"));
        students.add(new Student(60, "Student 6"));
        students.add(new Student(70, "Student 7"));
        students.add(new Student(80, "Student 8"));
        students.add(new Student(90, "Student 9"));
    }

    @Test
    public void whenCollectClassA() {
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Student 7"));
        expected.add(new Student(80, "Student 8"));
        expected.add(new Student(90, "Student 9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 50  && student.getScore() < 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Student 5"));
        expected.add(new Student(60, "Student 6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassC() {
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() < 50;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Student 1"));
        expected.add(new Student(20, "Student 2"));
        expected.add(new Student(30, "Student 3"));
        expected.add(new Student(40, "Student 4"));
        assertThat(rsl, is(expected));
    }
}