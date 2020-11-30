package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] cnsCOINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int i = 0; i < cnsCOINS.length; i++) {
            while (cnsCOINS[i] <= money) {
                money -= cnsCOINS[i];
                rsl[size++] = cnsCOINS[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
