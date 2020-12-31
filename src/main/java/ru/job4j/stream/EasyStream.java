package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> str = new ArrayList<>();

    public static EasyStream of(List<Integer> list) {
        EasyStream easyStream = new EasyStream();
        easyStream.str.addAll(list);
        return easyStream;
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        ArrayList<Integer> rsl = new ArrayList<>();
        for (Integer i : str) {
            rsl.add(fun.apply(i));
        }
        str = rsl;
        return this;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        ArrayList<Integer> rsl = new ArrayList<>();
        for (Integer i : str) {
            if (fun.test(i)) {
                rsl.add(i);
            }
        }
        str = rsl;
        return this;
    }

    public List<Integer> collect() {
        return str;
    }
}
