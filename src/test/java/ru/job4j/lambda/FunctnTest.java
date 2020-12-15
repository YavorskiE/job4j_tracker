package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctnTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Functn.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = Functn.diapason(-5, -1, x -> 2 * x * x - 1);
        List<Double> expected = Arrays.asList(49D, 31D, 17D, 7D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPowerFunctionThenPowerResults() {
        List<Double> result = Functn.diapason(1, 5, x -> Math.pow(5, x) + 2);
        List<Double> expected = Arrays.asList(7D, 27D, 127D, 627D);
        assertThat(result, is(expected));
    }
}