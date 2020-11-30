package ru.job4j.track;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        ItemOld itemOld = new ItemOld();
        itemOld.setName("test1");
        tracker.add(itemOld);
        ItemOld result = tracker.findById(itemOld.getId());
        assertThat(result.getName(), is(itemOld.getName()));
    }
}