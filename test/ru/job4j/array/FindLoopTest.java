package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then1() {
        int[] input = {45, 8, 456, 555, 454, 34, 22};
        int value = 8;
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas16Then3() {
        int[] input = {45, 44, 12, 166666, 432, 565, 5656};
        int value = 16;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
}