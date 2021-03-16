package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] inout = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(inout, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal0() {
        char[][] inout = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(inout, 0);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical2() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical1() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }
}