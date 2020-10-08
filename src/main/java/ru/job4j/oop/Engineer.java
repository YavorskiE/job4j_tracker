package ru.job4j.oop;

public class Engineer extends Profession{

    private String company;
    private String position;
    private int experience;

    public Engineer(String name, String surname, String ed, int birthday, String company, String position, int experience) {
        super(name, surname, ed, birthday);
        this.company = company;
        this.position = position;
        this.experience = experience;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }
}
