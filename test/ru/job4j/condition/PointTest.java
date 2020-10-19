package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistance00To20Then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    // x1 = 0, y2 = 4, x2 = 0, y2 = 1
    @Test
    public void whenDistance04To01Then3() {
        int expected = 3;
        int x1 = 0;
        int y1 = 4;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    // x1 = 1, y2 = 8, x2 = 1, y2 = 2
    @Test
    public void whenDistance18To12Then6() {
        int expected = 6;
        int x1 = 1;
        int y1 = 8;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    // x1 = 0, y2 = 8, x2 = 0, y2 = 1
    @Test
    public void whenDistance08To01Then7() {
        int expected = 7;
        int x1 = 0;
        int y1 = 8;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}