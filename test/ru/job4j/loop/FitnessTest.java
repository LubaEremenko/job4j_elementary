package ru.job4j.loop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.lift(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.lift(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.lift(50, 90);
        assertThat(month, is(2));
    }
}