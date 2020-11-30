package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"555"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(555));
    }

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"One", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidOutput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"One", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int askIntelected = input.askInt("Enter menu:");
        String expected = "Please enter validate data again." + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }
}