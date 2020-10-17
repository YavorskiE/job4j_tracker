package ru.job4j.tracker;

public class FindIdAction implements UserAction{

    @Override
    public String name() {
        return "=== Find Item by ID ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item =  tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("No Item found with ID = " + id);
        }
        return true;
    }
}
