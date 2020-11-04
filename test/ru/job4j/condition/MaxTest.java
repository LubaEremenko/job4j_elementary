package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft356Right11Then356() {
        int max = Max.compare(356, 11);
        assertThat(max, is(356));

    }

    @Test
    public void whenLeft4Right11Then11() {
        int max = Max.compare(4, 11);
        assertThat(max, is(11));

    }

    @Test
    public void whenLeft11Right11Then11() {
        int max = Max.compare(11, 11);
        assertThat(max, is(11));

    }
}