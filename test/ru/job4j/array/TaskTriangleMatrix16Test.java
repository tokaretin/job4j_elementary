package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTriangleMatrix16Test {

    @Test
    public void whenRows1() {
        int[][] result = {
                {1}
        };
        assertArrayEquals(result, TaskTriangleMatrix16.rows(1));
    }

    @Test
    public void whenRows2() {
        int[][] result = {
                {1}, {2, 3}
        };
        assertArrayEquals(result, TaskTriangleMatrix16.rows(2));
    }

    @Test
    public void whenRows3() {
        int[][] result = {
                {1}, {2, 3}, {4, 5, 6}
        };
        assertArrayEquals(result, TaskTriangleMatrix16.rows(3));
    }

}