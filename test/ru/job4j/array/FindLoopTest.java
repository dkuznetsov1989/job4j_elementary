package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3ThenNo() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {4, 12, 8};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 5, 8};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
}