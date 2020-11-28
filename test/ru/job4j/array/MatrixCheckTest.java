package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'x', 'x', 'x'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(board, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
        };
        boolean result = MatrixCheck.monoVertical(board, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(board);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] board = {
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(board);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] board = {
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', 'x', ' ', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(board);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] board = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'x', 'x', 'x', 'x', 'x'},
                {' ', ' ', 'x', ' ', ' '},
                {' ', ' ', 'x', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(board);
        assertThat(result, is(true));
    }

}