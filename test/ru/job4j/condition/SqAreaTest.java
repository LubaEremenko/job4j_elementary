package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP19K8Then8() {
        int p = 19;
        int k = 8;
        double expected = 8;
        double out = SqArea.square(19, 8);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP38K5Then45() {
        int p = 38;
        int k = 5;
        double expected = 45;
        double out = SqArea.square(38, 5);
        Assert.assertEquals(expected, out, 0.01);

    }

}