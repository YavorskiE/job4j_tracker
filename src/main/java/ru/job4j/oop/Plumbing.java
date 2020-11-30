package ru.job4j.oop;

public class Plumbing {

    private int extractionNum;
    private int plumbingNum;

    public Plumbing(int extractionNum, int plumbingNum) {
        this.extractionNum = extractionNum;
        this.plumbingNum = plumbingNum;
    }

    public int getExtractionNum() {
        return extractionNum;
    }

    public void setExtractionNum(int extractionNum) {
        this.extractionNum = extractionNum;
    }

    public int getPlumbingNum() {
        return plumbingNum;
    }

    public void setPlumbingNum(int plumbingNum) {
        this.plumbingNum = plumbingNum;
    }
}
