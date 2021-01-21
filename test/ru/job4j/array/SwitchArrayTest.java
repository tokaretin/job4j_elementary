package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rst = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 4, 3, 2};
        int[] rst = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenSwap2to1() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rst = SwitchArray.swap(input, 2, 1);
        assertThat(rst, is(expect));
    }
}