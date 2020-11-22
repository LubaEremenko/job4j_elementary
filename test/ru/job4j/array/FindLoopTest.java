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

}