package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(6);
        int[][] expect = {
                {1,	2, 3, 4, 5, 6},
                {2,	4, 6, 8, 10, 12},
                {3,	6, 9, 12, 15, 18},
                {4, 8, 12, 16, 20, 24},
                {5, 10, 15, 20, 25, 30},
                {6, 12, 18, 24, 30, 36}
                };
        assertThat(table, is(expect));
    }
}