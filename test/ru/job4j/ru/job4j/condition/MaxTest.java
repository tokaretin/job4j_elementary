package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public  void  whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
}