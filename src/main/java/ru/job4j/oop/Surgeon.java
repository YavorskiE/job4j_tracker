package ru.job4j.oop;

public class Surgeon extends Doctor {

    private int surgeryNum;

    public Surgeon(String name, String surname, String ed, int birthday, String hosp, int num,
                   int surgeryNum) {
        super(name, surname, ed, birthday, hosp, num);
        this.surgeryNum = surgeryNum;
    }

    public int getSurgeryNum() {
        return surgeryNum;
    }
}
