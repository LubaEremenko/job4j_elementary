package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {

            int[] array = {1, 2, 3, 4};
            int[] expect = {4, 2, 3, 1};
            int[] rsl = SwitchArray.swap(array, 0, 3);
            assertThat(rsl, is(expect));

    }

    @Test
    public void whenSwap1to2() {

        int[] array = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(array, 1, 2);
        assertThat(rsl, is(expect));

    }

}