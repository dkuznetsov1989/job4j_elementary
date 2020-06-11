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

    @Test
    public void whenFind3() {
        int [] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3isNo() {
        int [] input = new int[] {3, 1, 8, 9, 4, 7, 2};
        int value = 5;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind6() {
        int [] input = new int[] {5, 2, 10, 2, 4, 5, 1};
        int value = 1;
        int start = 3;
        int finish = 7;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 6;
        assertThat(result, is(expect));
    }
}