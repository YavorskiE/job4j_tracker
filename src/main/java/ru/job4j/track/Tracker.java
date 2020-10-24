package ru.job4j.track;

public class Tracker {
    private final Item_old[] itemOlds = new Item_old[100];
    private int ids = 1;
    private int size = 0;

    public Item_old add(Item_old itemOld) {
        itemOld.setId(ids++);
        itemOlds[size++] = itemOld;
        return itemOld;
    }

    public Item_old findById(int id) {
        Item_old rsl = null;
        for (int index = 0; index < size; index++) {
            Item_old itemOld = itemOlds[index];
            if (itemOld.getId() == id) {
                rsl = itemOld;
                break;
            }
        }
        return rsl;
    }
}