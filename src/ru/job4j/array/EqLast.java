package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        return left[left.length - 1] == right[right.length - 1];

    }

    public static void main(String[] args) {
        int[] left = new int[] {4, 5, 8, 5};
        int[] right = new int[] {1, 9, 5};
        boolean result = EqLast.check(left, right);
        System.out.println(result);
    }

}
