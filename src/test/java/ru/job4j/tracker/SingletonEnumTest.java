package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonEnumTest {

    @Test
    public void whenManyInstancesCreated() {
        Tracker first = SingletonEnum.INSTANCE.getTracker();
        Tracker second = SingletonEnum.INSTANCE.getTracker();
        Tracker third = SingletonEnum.INSTANCE.getTracker();
        Tracker fourth = SingletonEnum.INSTANCE.getTracker();
        assertTrue(first != null && first == second && first == third && first == fourth);
    }
}