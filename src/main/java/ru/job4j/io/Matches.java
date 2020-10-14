package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        boolean first = true;
        String player = "Первый";
        Scanner scanner = new Scanner(System.in);
        while  (matches > 0) {
            System.out.println("В игре спичек - " + matches);
            player = first ? "Первый" : "Второй";
            int max = matches <  3 ? matches : 3;
            System.out.print(player + " игрок может взять от 1 до " + max + " спичек, введите число - ");
            int taken = Integer.valueOf(scanner.nextLine());
            if (taken < 1 || taken > max) {
                System.out.println();
                System.out.println("Введенно неправильное число - повторите");
                continue;
            }
            matches -= taken;
            first = !first;
        }
        System.out.println();
        System.out.println("Выиграл " + player + " игрок");
    }
}
