package ru.job4j.tracker;

public class FindNameAction implements UserAction{

    @Override
    public String name() {
        return "=== Find Item(s) by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int count = 0; count < items.length; count++) {
                System.out.println(items[count]);
            }
        } else {
            System.out.println("No Item found with Name = " + name);
        }
        return true;
    }
}
