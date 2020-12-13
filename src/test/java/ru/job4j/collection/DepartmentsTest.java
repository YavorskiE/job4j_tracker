package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expected = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expected = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortAscending() {
        List<String> input = List.of(
                "K2/SK1/SSK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK2"
        );
        List<String> expected = List.of(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        List<String> output = Departments.fillGaps(input);
        Departments.sortAsc(output);
        assertThat(output, is(expected));
    }

    @Test
    public void whenSortDescending() {
        List<String> input = List.of(
                "K2/SK1/SSK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK2"
        );
        List<String> expected = List.of(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        List<String> output = Departments.fillGaps(input);
        Departments.sortDesc(output);
        assertThat(output, is(expected));
    }
}