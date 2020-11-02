package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when26to39Then15() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -3;
        int y2 = -9;
        double expected = 15.81;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when65to21Then5() {
        int x1 = -6;
        int y1 = 5;
        int x2 = -2;
        int y2 = 1;
        double expected = 5.65;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when36to85Then15() {
        int x1 = 3;
        int y1 = -6;
        int x2 = -8;
        int y2 = 5;
        double expected = 15.55;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when39to85Then15() {
        int x1 = 3;
        int y1 = -6;
        int x2 = -8;
        int y2 = 5;
        double expected = 15.55;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
