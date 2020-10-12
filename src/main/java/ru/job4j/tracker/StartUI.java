package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("Test Name");
        tracker.add(item);
        Item itemFound = tracker.findById(1);
        System.out.println("\"id\" = " + itemFound.getId() + "; \"name\" = " + itemFound.getName());
    }
}
