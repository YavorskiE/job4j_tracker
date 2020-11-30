package ru.job4j.track;

public class Tracker {
    private final ItemOld[] itemOlds = new ItemOld[100];
    private int ids = 1;
    private int size = 0;

    public ItemOld add(ItemOld itemOld) {
        itemOld.setId(ids++);
        itemOlds[size++] = itemOld;
        return itemOld;
    }

    public ItemOld findById(int id) {
        ItemOld rsl = null;
        for (int index = 0; index < size; index++) {
            ItemOld itemOld = itemOlds[index];
            if (itemOld.getId() == id) {
                rsl = itemOld;
                break;
            }
        }
        return rsl;
    }
}