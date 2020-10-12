package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book head = new Book("Head First", 450);
        Book think = new Book("Thinking in Java", 650);
        Book clean = new Book("Clean Code", 700);
        Book fund = new Book("Java Fundamental", 900);
        Book[] books = new Book[4];
        books[0] = head;
        books[1] = think;
        books[2] = clean;
        books[3] = fund;
        Book bk;
        for (int index = 0; index < books.length; index++) {
            bk = books[index];
            System.out.println("Book \"" + bk.getTitle() + "\" has " + bk.getPages()  + " pages");
        }

        System.out.println();
        bk = books[0];
        books[0] = books[3];
        books[3] = bk;
        for (int index = 0; index < books.length; index++) {
            bk = books[index];
            System.out.println("Book \"" + bk.getTitle() + "\" has " + bk.getPages() + " pages");
        }

        System.out.println();
        for (int index = 0; index < books.length; index++) {
            bk = books[index];
            if ("Clean Code".equals(bk.getTitle())) {
                System.out.println("Book \"" + bk.getTitle() + "\" has " + bk.getPages()  + " pages");
            }
        }
    }
}
