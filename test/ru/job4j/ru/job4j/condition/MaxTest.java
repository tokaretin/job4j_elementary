package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax7To3Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax7To3To2Then7() {
        int result = Max.max(7, 3, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax6To33To2hen33() {
        int result = Max.max(6, 33, 2);
        assertThat(result, is(33));
    }

    @Test
    public void whenMax50To52To58Then58() {
        int result = Max.max(50, 52, 58);
        assertThat(result, is(58));
    }

    @Test
    public void whenMax1To2To3to4Then4() {
        int result = Max.max(4, 2, 3, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax10To11To12to13Then13() {
        int result = Max.max(10, 13, 11, 12);
        assertThat(result, is(13));
    }

    @Test
    public void whenMax21To22To23to24Then24() {
        int result = Max.max(21, 22, 24, 23);
        assertThat(result, is(24));
    }

    @Test
    public void whenMax31To32To33to34Then34() {
        int result = Max.max(31, 32, 33, 34);
        assertThat(result, is(34));
    }
}