package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(1.0, 2.0, 3.0);
        assertThat(result, is(false));
    }

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 4.0, 3.0);
        assertThat(result, is(true));
    }
}