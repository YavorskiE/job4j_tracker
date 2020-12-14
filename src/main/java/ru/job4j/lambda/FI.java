package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("Image 1", 20),
                new Attachment("Image 3", 120),
                new Attachment("Image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comparator);
        for (Attachment att : atts) {
            System.out.println(att);
        }

        Comparator<String> cmpText = (left, right) -> left.compareTo(right);

        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();

        String[] array = {"First", "Second", "Third", "Fourth"};
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();

        Arrays.sort(array);
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

        String[] numbers = {
                "1. Task",
                "2. Task",
                "11. Task"
        };

        Comparator<String> numStr = (left, right) -> {
            int first = Integer.valueOf(left.substring(0, left.indexOf('.')));
            int second = Integer.valueOf(right.substring(0, right.indexOf('.')));
            return first - second;
        };

        for (String s : numbers) {
            System.out.println(s.substring(0, s.indexOf('.')));
        }
        System.out.println();

        Arrays.sort(numbers, numStr);
        for (String s : numbers) {
            System.out.println(s);
        }
    }
}