package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3};
        int el = 5;
        int rsl = FindLoop.indexOf(data, el);
        int expect = 0;
        assertThat(rsl, is(expect));

    }

    @Test
    public void whenArrayHas9Then1() {
        int[] data = {5, 4, 3};
        int el = 9;
        int rsl = FindLoop.indexOf(data, el);
        int expect = -1;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] data = new int[] {5, 10, 3, 9, 13, 81};
        int el = 14;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind5() {
        int[] data = new int[]{5, 2, 10, 2, 4, 144, 325};
        int el = 144;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
}