package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenAscending() {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.setId(1);
        item2.setId(2);
        item3.setId(3);
        item4.setId(4);
        List<Item> input = Arrays.asList (
                item2,
                item3,
                item1,
                item4
        );
        List<Item> expected = Arrays.asList (
                item1,
                item2,
                item3,
                item4
        );
        Collections.sort(input);
        assertThat(input, is(expected));
    }

    @Test
    public void whenDescending() {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.setId(1);
        item2.setId(2);
        item3.setId(3);
        item4.setId(4);
        List<Item> input = Arrays.asList (
                item2,
                item3,
                item1,
                item4
        );
        List<Item> expected = Arrays.asList (
                item4,
                item3,
                item2,
                item1
        );
        Collections.sort(input, new SortItems());
        assertThat(input, is(expected));
    }
}