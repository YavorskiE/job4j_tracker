package ru.job4j.tracker;

public class TrackerSingleLazyInit {
    private static Tracker instance;

    private TrackerSingleLazyInit() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
