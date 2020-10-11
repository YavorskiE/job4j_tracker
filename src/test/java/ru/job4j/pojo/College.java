package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup("#73A");
        student.setAdmitted(new Date());
        System.out.println(student.getName() + ", Group " + student.getGroup()
                + " was admitted on " + student.getAdmitted());
    }
}
