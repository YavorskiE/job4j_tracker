package ru.job4j.oop;

public class Programmer extends Engineer {

    private String language;

//    public Programmer(String name, String surname, String ed, int birthday, String company,
//                      String position, int experience, String language) {
//        super(name, surname, ed, birthday, company, position, experience);
//        this.language = language;
//    }

    public Programmer(String name, String surname, String ed, int birthday, Career career,
                      String language) {
        super(name, surname, ed, birthday, career);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
