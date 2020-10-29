package ru.job4j.tracker;

public class TrackerSingleEagerInit {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingleEagerInit() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }
}
