package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));

    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {5, 4, 1, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));

    }

}