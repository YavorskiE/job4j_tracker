package ru.jo4bj.oop;

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void music(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
//        petya.music();
//        petya.music();
//        petya.music();
//        petya.song();
//        petya.song();
//        petya.song();
        String song = "I believe I can fly";
        petya.music(song);
    }
}
