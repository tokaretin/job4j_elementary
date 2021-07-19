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
}