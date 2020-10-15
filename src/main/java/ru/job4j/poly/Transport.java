package ru.job4j.poly;

public interface Transport {
    void deliver();

    void passengers(int number);

    int fuel(double liters);
}
