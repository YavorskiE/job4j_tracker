package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item number", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item number"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", "1", replacedName , "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Deleted item");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("First item");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        String actual = out.toString();
        String expected =
                "Menu." + System.lineSeparator() +
                "0. " + actions[0].name() + System.lineSeparator() +
                "1. " + actions[1].name() + System.lineSeparator() +
                actions[0].name() + System.lineSeparator() +
                "Item{id=" + item.getId() + ", name='" + item.getName() + "'}" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. " + actions[0].name() + System.lineSeparator() +
                "1. " + actions[1].name() + System.lineSeparator();
        assertThat(actual, is(expected));
    }

    @Test
    public void whenFindId() {
        Tracker tracker = new Tracker();
        Item[] items = {new Item("First item"), new Item("Second Item")};
        tracker.add(items[0]);
        tracker.add(items[1]);
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0","2","1"}
        );
        UserAction[] actions = {
                new FindIdAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        String actual = out.toString();
        String expected =
                "Menu." + System.lineSeparator() +
                "0. " + actions[0].name() + System.lineSeparator() +
                "1. " + actions[1].name() + System.lineSeparator() +
                actions[0].name() + System.lineSeparator() +
                "Item{id=" + items[1].getId() + ", name='" + items[1].getName() + "'}" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. " + actions[0].name() + System.lineSeparator() +
                "1. " + actions[1].name() + System.lineSeparator();
        assertThat(actual, is(expected));
    }

    @Test
    public void whenFindName() {
        Tracker tracker = new Tracker();
        Item[] items = {new Item("First item"), new Item("Second item")};
        tracker.add(items[0]);
        tracker.add(items[1]);
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0","Second item","1"}
        );
        UserAction[] actions = {
                new FindNameAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        String actual = out.toString();
        String expected =
                "Menu." + System.lineSeparator() +
                "0. " + actions[0].name() + System.lineSeparator() +
                "1. " + actions[1].name() + System.lineSeparator() +
                actions[0].name() + System.lineSeparator() +
                "Item{id=" + items[1].getId() + ", name='" + items[1].getName() + "'}" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. " + actions[0].name() + System.lineSeparator() +
                "1. " + actions[1].name() + System.lineSeparator();
        assertThat(actual, is(expected));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. " + actions[0].name() + System.lineSeparator()
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. " + actions[0].name() + System.lineSeparator()
                )
        ));
    }

}