package ru.job4j.tracker;

public class EditAction implements UserAction {

    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(this.name());
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Edit complete");
        } else {
            out.println("Edit failed");
        }
        return true;
    }
}
