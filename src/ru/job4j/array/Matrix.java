package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
               table[i][j] = (i + 1) * (j + 1);

            }

        }

        return table;
    }

    public static void main(String[] args) {
        int[][] table = Matrix.multiple(9);
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j] + " ");

            }

        }

    }

}
