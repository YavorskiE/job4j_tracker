package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int number);

    int fuel(double liters);
}
