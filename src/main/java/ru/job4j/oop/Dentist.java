package ru.job4j.oop;

public class Dentist extends Doctor{

    private int extractionNum;
    private int plumbingNum;

    public Dentist(String name, String surname, String ed, int birthday, String hosp, int num, int extractionNum, int plumbingNum) {
        super(name, surname, ed, birthday, hosp, num);
        this.extractionNum = extractionNum;
        this.plumbingNum = plumbingNum;
    }

    public int getExtractionNum() {
        return extractionNum;
    }

    public int getPlumbingNum() {
        return plumbingNum;
    }
}
