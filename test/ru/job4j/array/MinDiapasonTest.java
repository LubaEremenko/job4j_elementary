package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[]{10, 1, 61, 71, 81, 2, 91};
        int start = 1;
        int finis = 5;
        int expect = 1;
        int min = MinDiapason.findMin(array, 1, 5);
        assertThat(min, is(expect));
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 51, 61, 71, 81, 2, 91};
        int start = 1;
        int finis = 5;
        int expect = 2;
        int min = MinDiapason.findMin(array, 1, 5);
        assertThat(min, is(expect));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 51, 61, 1, 81, 210, 91};
        int start = 1;
        int finis = 5;
        int expect = 1;
        int min = MinDiapason.findMin(array, 1, 5);
        assertThat(min, is(expect));
    }

    }
