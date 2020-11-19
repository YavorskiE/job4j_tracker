package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
        if (items.get(index).getId() == id) {
            rsl = index;
            break;
        }
    }
        return rsl;
    }


    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> itemsRes = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                itemsRes.add(item);
            }
        }
        return itemsRes;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            item.setId(id);
            items.set(index, item);
        }
        return res;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
            items.remove(index);
        }
        return res;
    }
}