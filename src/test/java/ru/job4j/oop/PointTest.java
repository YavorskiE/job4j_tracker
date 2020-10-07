package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenPoint02ThenDistance2Test() {
//        int x1 = 0, y1 = 0;
//        int x2 = 2, y2 = 0;
        Point x = new Point(0, 2);
        Point y = new Point(0, 0);
        double expected = 2.0;
//        double out = Point.distance(x1, y1, x2, y2);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPoint02ThenDistance3D2Test() {
        Point x = new Point(0, 2, 0);
        Point y = new Point(0, 0, 0);
        double expected = 2.0;
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }
}