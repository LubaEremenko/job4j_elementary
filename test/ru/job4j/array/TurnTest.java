package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int temp;
        int[] array = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(array);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int temp;
        int[] array = new int[] {1, 2, 9, 4, 5};
        int[] result = Turn.back(array);
        int[] expect = new int[] {5, 4, 9, 2, 1};
        assertThat(result, is(expect));

    }
}