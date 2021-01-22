package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int [] right){
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length + right.length; i++) {
            if (left[i] < right[i]) {
                rsl[i] = left[i];
            } else {
                rsl[i] = right[i];
            }

        }
        return rsl;
    }


    public static void main(String[] args) {
        int[] left = {5, 6, 2};
        int[] right = {9, 3, 5};
        int[] rsl = merge(int[] right, int[]right);
        System.out.println(rsl);

}
