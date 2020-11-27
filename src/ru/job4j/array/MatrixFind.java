package ru.job4j.array;

public class MatrixFind {
    public static void find(int[][] array, int el) {
        System.out.println("find index of el=" + el);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int val = array[i][j];
                if (val == el) {
                    System.out.println("Row:" + i + " index " + j);
                }

            }

        }

    }

    public static void main(String[] args) {
        int[][] aray = {
                {0, 8, 6},
                {9, 5, 8},
                {8, 2, 4}
        };
        MatrixFind.find(aray, 8);

    }

}
