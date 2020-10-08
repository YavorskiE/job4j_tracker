package ru.job4j.oop;

public class Doctor extends Profession{

    private String hospital;
    private int roomNumber;

    public Doctor(String name, String surname, String ed, int birthday, String hosp, int num ) {
        super(name, surname, ed, birthday);
        hospital = hosp;
        roomNumber = num;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Diagnosis heal(Pacient pacient) {
    }
}
