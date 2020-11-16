package ru.job4j.collection;

import java.util.List;
import java.util.ArrayList;

public class ConvertList {
    public List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] array : list) {
            for  (int element : array) {
                rsl.add(element);
            }
        }
        return rsl;
    }
}
