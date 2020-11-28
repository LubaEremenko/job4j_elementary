package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++)
            if (board[row][i] != 'x') {
                result = false;
                break;
            }
            return result;
    }

    public static boolean monoVertical (char[][] board, int column) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if(board[j][column] != 'x') {
                result = false;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'x', 'x', 'x'},
                {'x', ' ', 'x'},
                {'x', 'x', 'x'}
        };
        boolean result = MatrixCheck.monoVertical(board, 1);
        System.out.println(result);

    }

}

