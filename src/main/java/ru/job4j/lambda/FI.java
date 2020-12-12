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
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getSize() - o2.getSize();
            }
        };
        Arrays.sort(atts, comparator);
        for (Attachment att : atts) {
            System.out.println(att);
        }
    }
}