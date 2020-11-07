package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenStart1Finish10Then30() {
    int sum = Counter.sumByEven(1, 10);
    int expected = 30;
    assertThat(sum, is(expected));

    }

}