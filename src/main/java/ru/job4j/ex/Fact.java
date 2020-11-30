package ru.job4j.ex;

import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(calc(n));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument cannot be negative");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
