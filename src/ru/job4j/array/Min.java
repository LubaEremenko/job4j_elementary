package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];

            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {45, 55, 62, 98, 21};
        int min = Min.findMin(array);
        System.out.println(min);
    }
}
