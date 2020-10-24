package ru.job4j.tracker;

public class TrackerSingleSubclass {

    private TrackerSingleSubclass() {
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }
}
