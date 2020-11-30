package ru.job4j.oop;

public class College {
    private Freshman freshman = new Freshman();
    private Student student = freshman;

    public Freshman getFreshman() {
        return freshman;
    }

    public Student getStudent() {
        return student;
    }
}
