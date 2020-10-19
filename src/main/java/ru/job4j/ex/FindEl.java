package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == null) {
                throw new NullPointerException("Element " + index + " refers null pointer");
            }
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element '" + key + "' not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"Ebay", "Amazon", "Ozon", "Alibaba"};
        try {
            System.out.println(indexOf(value, "_Ozon"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
