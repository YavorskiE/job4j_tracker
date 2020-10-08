package ru.job4j.oop;

public class Pacient {

    private String name;
    private String surname;
    private String address;
    private int age;

    public Pacient(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
