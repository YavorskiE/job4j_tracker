package ru.job4j.inheritance;

public class JsonReport extends TextReport{
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                "\"name\" : \"" + name + "\"," + System.lineSeparator() +
                "\"body\" : \"" + body + System.lineSeparator() +
                "}";
    }
}
