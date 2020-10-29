package ru.job4j.tracker;

public enum SingletonEnum {
    INSTANCE;

    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}