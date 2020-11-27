package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               rsl += array[i][j];

            }
        }
        return rsl;

    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        int rsl = MatrixSum.sum(array);
        System.out.println(rsl);

    }
}
