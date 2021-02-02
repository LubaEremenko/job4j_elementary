package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge<rsl> {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftMinIndex = 0;
        int rightMinIndex = 0;
        int rslMinIndex = 0;

        while (leftMinIndex < left.length && rightMinIndex < right.length) {
            if (left[leftMinIndex] <= right[rightMinIndex]) {
                rsl[rslMinIndex] = left[leftMinIndex];
                leftMinIndex++; // указание на то что след минимальное число находится справа,
                // поэтому перемещаем индекс на одну единицу
            } else {
                rsl[rslMinIndex] = right[rightMinIndex];
                right[rightMinIndex]++;
            }
            rslMinIndex++;
        }
        while (leftMinIndex < left.length) { // пока в левом массиве есть числа мы переносим
            rsl[rslMinIndex] = left[leftMinIndex];
            leftMinIndex++;
            rslMinIndex++;
        }
        while (rightMinIndex < right.length) {
            rsl[rslMinIndex] = right[rightMinIndex];
            rightMinIndex++;
            rslMinIndex++;

            int middel = rsl.length / 2;
            int[] rslLeftPart = new int[middel];
            int[] rslRightPart = new int[rsl.length - middel];

            for (int i = 0; i < middel; i++) {
                rslLeftPart[i] = rsl[i];
            }
            for (int i = middel; i < rsl.length; i++) {
                rslRightPart[i - middel] = rsl[i];

            }

        }

        return rsl;

    }

    public static void main(String[] args) {
        int[] left = {5, 6, 2};
        int[] right = {9, 3, 5};
        int[] rsl = new int[left.length + right.length];

        merge(left, right);

        for(int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i] + " ");
        }

    }

}
