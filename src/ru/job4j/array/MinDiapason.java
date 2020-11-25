package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];

            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 51, 61, 71, 81, 2, 91};
        int start = 1;
        int finis = 5;
        int result = MinDiapason.findMin(array, 1, 5);
        System.out.println(result);
    }
}
