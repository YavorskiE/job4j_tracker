package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class UniqueTextTest {

    @Test
    public void isEqual() {
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats milk and a mouse";
        assertThat(UniqueText.isEqual(origin, text), is(true));
    }

    @Test
    public void isNotEqual() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by my cat";
        assertThat(UniqueText.isEqual(origin, text), is(false));
    }

}