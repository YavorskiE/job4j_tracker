package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> predictor = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };
        return filter(list, predictor);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> predictor = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };
        return filter(list, predictor);
    }

    public static void main(String[] args) {
        List<Attachment> list = List.of(
                new Attachment("First bug", 250),
                new Attachment("First bag", 100),
                new Attachment("bug-bug-bug", 80),
                new Attachment("Another bug", 2000),
                new Attachment("Bug", -200)
        );
        System.out.println(filterSize(list));
        System.out.println(filterName(list));
    }
}