package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream()
                .map(Profile::getAddress)
                .sorted((left, right) -> left.getCity().compareTo(right.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}