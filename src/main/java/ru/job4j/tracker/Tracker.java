package ru.job4j.tracker;

//import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Tracker {
//    private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
//    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
//        items[size++] = item;
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
//        for (int index = 0; index < size; index++) {
//        if (items[index].getId() == id) {
//            rsl = index;
//            break;
//        }
//    }
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
//        return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

//    public Item[] findAll() {
//        return Arrays.copyOf(items, size);
//    }
    public List<Item> findAll() {
        return items;
    }

//    public Item[] findByName(String key) {
//        Item[] itemsRes = new Item[size];
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (key.equals(items[i].getName())) {
//                itemsRes[count++] = items[i];
//            }
//        }
//        return Arrays.copyOf(itemsRes, count);
//    }
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
//            items[index] = item;
            items.set(index, item);
        }
        return res;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
//            System.arraycopy(items, index + 1, items, index, size - index);
//            items[size] = null;
//            size--;
            items.remove(index);
        }
        return res;
    }
}
