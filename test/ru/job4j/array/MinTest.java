package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {5, 55, 62, 98, 21};
        int expect = 5;
        int min = Min.findMin(array);
        assertThat(min, is(expect));
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {558, 55, 62, 98, 21};
        int expect = 21;
        int min = Min.findMin(array);
        assertThat(min, is(expect));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {558, 55, 2, 98, 21};
        int expect = 2;
        int min = Min.findMin(array);
        assertThat(min, is(expect));
    }
}
