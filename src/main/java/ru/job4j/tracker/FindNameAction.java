package ru.job4j.tracker;

public class FindNameAction implements UserAction{

    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find Item(s) by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(this.name());
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int count = 0; count < items.length; count++) {
                out.println(items[count]);
            }
        } else {
            out.println("No Item found with Name = " + name);
        }
        return true;
    }
}
