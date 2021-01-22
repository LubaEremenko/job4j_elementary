package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] rsl = new int[0];


        while (i < left.length) {
            rsl[k] = left[i];
            i++;
            k++;

        }

        while (j < right.length) {
            rsl[k] = right[j];
            j++;
            k++;

        }
        Arrays.sort(rsl);
        return rsl;
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        int left[] = {5, 6, 2};
        int right[] = {9, 3, 5};
        int rsl[] = new int[left.length + right.length];

        merge(left, right);

        for(int i = 0; i < left.length + right.length; i++) {
            System.out.println(rsl[i]);
        }

    }

}
