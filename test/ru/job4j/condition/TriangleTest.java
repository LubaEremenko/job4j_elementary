package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean msg = Triangle.exist(17, 25, 36);
        assertThat(msg, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean msg = Triangle.exist(65, 25, 36);
        assertThat(msg, is(false));

    }

}