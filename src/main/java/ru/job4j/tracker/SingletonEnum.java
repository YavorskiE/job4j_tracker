package ru.job4j.tracker;

public enum SingletonEnum {
    INSTANCE;

    private static final Tracker tracker = new Tracker();

    public static Tracker getTracker() {
        return tracker;
    }
}