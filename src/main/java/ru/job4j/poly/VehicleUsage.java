package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle minivan  = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{bus, minivan, airplane, train};
        for (Vehicle v: vehicles) {
            v.move();
        }
    }
}
