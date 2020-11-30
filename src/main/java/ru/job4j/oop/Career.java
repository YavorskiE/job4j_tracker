package ru.job4j.oop;

public class Career {

    private String company;
    private String position;
    private int experience;

    public Career(String company, String position, int experience) {
        this.company = company;
        this.position = position;
        this.experience = experience;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
