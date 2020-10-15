package ru.job4j.tracker;

//import java.util.Scanner;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name =  input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show All Items ====");
                Item[] items = tracker.findAll();
                for (int count = 0; count < items.length; count++) {
                    System.out.println(items[count]);
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                int id = input.askInt("Enter id: ");
                String name =  input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Edit complete");
                } else {
                    System.out.println("Edit failed");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                int id = input.askInt("Enter id: ");
                if (tracker.delete(id)) {
                    System.out.println("Delete complete");
                } else {
                    System.out.println("Delete failed");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID ====");
                int id = input.askInt("Enter id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("No Item found with ID = " + id);
                }
            } else if (select == 5) {
                System.out.println("=== Find Item(s) by Name ====");
                String name =  input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int count = 0; count < items.length; count++) {
                        System.out.println(items[count]);
                    }
                } else {
                    System.out.println("No Item found with Name = " + name);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
