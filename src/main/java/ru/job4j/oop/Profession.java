package ru.job4j.oop;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession(String name, String surname, String ed, int birthday) {
        this.name = name;
        this.surname = surname;
        education = ed;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}
