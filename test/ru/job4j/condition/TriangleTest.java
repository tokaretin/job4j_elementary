package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExistA() {
        boolean result = Triangle.notExistA(2.0, 2.0, 2.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotExistB() {
        boolean result = Triangle.notExistB(2.0, 2.0, 2.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotExistC() {
        boolean result = Triangle.notExistC(2.0, 2.0, 2.0);
        assertThat(result, is(false));
    }
}