package ru.job4j.tracker;

public class ShowAction implements UserAction{

    @Override
    public String name() {
        return "=== Show All Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int count = 0; count < items.length; count++) {
            System.out.println(items[count]);
        }
        return true;
    }
}
