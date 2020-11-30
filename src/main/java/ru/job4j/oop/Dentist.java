package ru.job4j.oop;

public class Dentist extends Doctor {

    private Plumbing plumbing;

//    public Dentist(String name, String surname, String ed, int birthday, String hosp, int num,
//                   int extractionNum, int plumbingNum) {
//        super(name, surname, ed, birthday, hosp, num);
//        this.extractionNum = extractionNum;
//        this.plumbingNum = plumbingNum;
//    }
//
//    public int getExtractionNum() {
//        return extractionNum;
//    }
//
//    public int getPlumbingNum() {
//        return plumbingNum;
//    }

    public Dentist(String name, String surname, String ed, int birthday, String hosp, int num,
                   Plumbing plumbing) {
        super(name, surname, ed, birthday, hosp, num);
        this.plumbing = plumbing;
    }

    public Plumbing getPlumbing() {
        return plumbing;
    }
}
