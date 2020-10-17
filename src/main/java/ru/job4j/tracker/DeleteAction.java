package ru.job4j.tracker;

public class DeleteAction implements UserAction{

    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete complete");
        } else {
            System.out.println("Delete failed");
        }
        return true;
    }
}
