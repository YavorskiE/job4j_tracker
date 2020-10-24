package ru.job4j.track;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item_old itemOld = new Item_old();
        itemOld.setName("test1");
        tracker.add(itemOld);
        Item_old result = tracker.findById(itemOld.getId());
        assertThat(result.getName(), is(itemOld.getName()));
    }
}