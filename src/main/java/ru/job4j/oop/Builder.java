package ru.job4j.oop;

public class Builder extends Engineer{

    private String specialization;

    public Builder(String name, String surname, String ed, int birthday, String company, String position, int experience, String specialization) {
        super(name, surname, ed, birthday, company, position, experience);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
