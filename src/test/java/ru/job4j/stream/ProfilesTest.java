package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collectWhenDifferentCities() {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(new Address("Moscow", "Central", 20, 10)));
        profiles.add(new Profile(new Address("Khabarovsk", "Historic", 1, 122)));
        profiles.add(new Profile(new Address("Sverdlovsk", "Historic", 1, 122)));
        profiles.add(new Profile(new Address("Novgorod", "Central", 20, 10)));
        List<Address> result = new Profiles().collect(profiles);
        List<Address> expected = List.of(
                new Address("Khabarovsk", "Historic", 1, 122),
                new Address("Moscow", "Central", 20, 10),
                new Address("Novgorod", "Central", 20, 10),
                new Address("Sverdlovsk", "Historic", 1, 122)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void collectWhenSameCities() {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(new Address("Moscow", "Central", 20, 10)));
        profiles.add(new Profile(new Address("Sverdlovsk", "Historic", 1, 122)));
        profiles.add(new Profile(new Address("Sverdlovsk", "Popova", 5, 22)));
        profiles.add(new Profile(new Address("Moscow", "Gorkogo", 11, 25)));
        List<Address> result = new Profiles().collect(profiles);
        List<Address> expected = List.of(
                new Address("Moscow", "Central", 20, 10),
                new Address("Sverdlovsk", "Historic", 1, 122)
        );
        assertThat(result, is(expected));
    }
}