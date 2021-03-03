package ru.job4j.array;

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
}