package ru.job4j.oop;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int discount() {
        return 0;
    }

    public int price() {
        return price - discount();
    }

    public String label() {
        return name + " " + price();
    }
}