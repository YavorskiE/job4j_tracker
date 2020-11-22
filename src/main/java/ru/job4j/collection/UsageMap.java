package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("YavorskiE@outlook.com", "Yevgeniy Yavorsky");
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : map.keySet())  {
            System.out.println(key + " = " + map.get(key));
        }
    }
}