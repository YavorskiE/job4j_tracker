package ru.job4j.track;

import java.time.LocalDateTime;

public class ItemOld {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public ItemOld() {
    }

    public ItemOld(int num) {
        id = num;
    }

    public ItemOld(int num, String name) {
        id = num;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created
                + '}';
    }
}