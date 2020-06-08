package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenEvenNumber() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenOddNumber() {
        int[] input = {3, 4, 5, 6, 7};
        int[] expect = {7, 6, 5, 4, 3};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}