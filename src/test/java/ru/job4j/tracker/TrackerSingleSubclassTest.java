package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TrackerSingleSubclassTest {

    @Test
    public void whenManyInstancesCreated() {
        Tracker first = TrackerSingleSubclass.getInstance();
        Tracker second = TrackerSingleSubclass.getInstance();
        Tracker third = TrackerSingleSubclass.getInstance();
        Tracker fourth = TrackerSingleSubclass.getInstance();
        assertTrue(first != null && first == second && first == third && first == fourth);
    }
}