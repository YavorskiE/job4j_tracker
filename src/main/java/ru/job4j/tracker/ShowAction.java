package ru.job4j.tracker;

import java.util.List;

public class ShowAction implements UserAction {

    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show All Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(this.name());
//        Item[] items = tracker.findAll();
//        for (int count = 0; count < items.length; count++) {
//            out.println(items[count]);
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            out.println(item);
        }
        return true;
    }
}
