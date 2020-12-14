package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("Attachment 1", 100),
                new Attachment("Attachment 2", 34),
                new Attachment("Attachment 3", 13)
        );

        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("Compare - " + left.getSize() + " : " + right.getSize());
            return left.getSize() - right.getSize();
        };

        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comparator2 = new Comparator<>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };

        attachments.sort(comparator2);
        System.out.println(attachments);
    }
}