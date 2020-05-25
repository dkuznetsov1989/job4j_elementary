package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
        result = Max.max(4,3);
        assertThat(result, is(4));
        result = Max.max(6,6);
        assertThat(result, is(6));
    }
}