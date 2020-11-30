package ru.job4j.track;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        ItemOld itemOld = new ItemOld();

        LocalDateTime currentDateTime = itemOld.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Дата и время создания объекта " + formattedDateTime);

        System.out.println(itemOld);
    }
}
