package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] array = {null, "I"};
        String[] compressed = Defragment.compress(array);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notFirstNull() {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull() {
        String[] array = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllNull() {
        String[] array = {null, null, null};
        String[] compressed = Defragment.compress(array);
        String[] expected = {null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void notAllAtFirstNull() {
        String[] array = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}