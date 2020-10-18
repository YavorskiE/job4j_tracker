package ru.job4j.tracker;

public class DeleteAction implements UserAction{

    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(this.name());
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Delete complete");
        } else {
            out.println("Delete failed");
        }
        return true;
    }
}
