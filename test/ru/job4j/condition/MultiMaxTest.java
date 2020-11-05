package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int rsl = MultiMax.compare(9, 6, 3);
        assertThat(rsl, is(9));
    }

    @Test
    public void whenSecondMax() {
        int rsl = MultiMax.compare(9, 16, 3);
        assertThat(rsl, is(16));
    }

    @Test
    public void whenThirdMax() {
        int rsl = MultiMax.compare(9, 6, 13);
        assertThat(rsl, is(13));
    }

}