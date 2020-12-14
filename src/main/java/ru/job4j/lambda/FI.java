package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("Comparing - " + left + " : " + right);
            return right.compareTo(left);
        };

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("Comparing - " + left + " : " + right);
            return right.length() - left.length();
        };

        String[] array = {"First", "Second", "Third", "Fourth"};
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();

        Arrays.sort(array, cmpText);
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();

        Arrays.sort(array, cmpDescSize);
        for (String s : array) {
            System.out.println(s);
        }
    }
}