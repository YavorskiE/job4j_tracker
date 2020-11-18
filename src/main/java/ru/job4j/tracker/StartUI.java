package ru.job4j.tracker;

import java.util.List;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
    boolean run = true;
    while (run) {
        this.showMenu(actions);
        int select = input.askInt("Select: ");
        if (select < 0 || select >= actions.size()) {
            out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
            continue;
        }
        UserAction action = actions.get(select);
        run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
//        for (int index = 0; index < actions.length; index++) {
//            out.println(index + ". " + actions[index].name());
        for (UserAction action : actions) {
            out.println(actions.indexOf(action) + ". " + action.name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new CreateAction(output),
//                new ShowAction(output),
//                new EditAction(output),
//                new DeleteAction(output),
//                new FindIdAction(output),
//                new FindNameAction(output),
//                new Exit()
//        };
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ShowAction(output),
                new EditAction(output),
                new DeleteAction(output),
                new FindIdAction(output),
                new FindNameAction(output),
                new Exit()
        );
        new StartUI(output).init(input, tracker, actions);
    }
}
