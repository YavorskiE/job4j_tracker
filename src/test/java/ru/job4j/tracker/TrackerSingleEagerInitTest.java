package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TrackerSingleEagerInitTest {

    @Test
    public void whenManyInstancesCreated() {
        Tracker first = TrackerSingleEagerInit.getInstance();
        Tracker second = TrackerSingleEagerInit.getInstance();
        Tracker third = TrackerSingleEagerInit.getInstance();
        Tracker fourth = TrackerSingleEagerInit.getInstance();
        assertTrue(first != null && first == second && first == third && first == fourth);
    }
}