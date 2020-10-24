package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TrackerSingleLazyInitTest {

    @Test
    public void whenManyInstancesCreated() {
        Tracker first = TrackerSingleLazyInit.getInstance();
        Tracker second = TrackerSingleLazyInit.getInstance();
        Tracker third = TrackerSingleLazyInit.getInstance();
        Tracker fourth = TrackerSingleLazyInit.getInstance();
        assertTrue(first != null && first == second && first == third && first == fourth);
    }
}