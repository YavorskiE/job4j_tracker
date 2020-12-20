package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void whenConvert() {
        Integer[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        assertThat(new Matrix().convert(array), is(expected));
    }
}