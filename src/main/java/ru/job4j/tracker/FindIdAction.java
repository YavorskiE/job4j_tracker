package ru.job4j.tracker;

public class FindIdAction implements UserAction {

    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find Item by ID ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(this.name());
        int id = input.askInt("Enter id: ");
        Item item =  tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("No Item found with ID = " + id);
        }
        return true;
    }
}
