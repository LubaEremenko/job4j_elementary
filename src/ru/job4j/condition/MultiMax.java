package ru.job4j.condition;

public class MultiMax {
    public static int compare(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;

    }

    public static void main(String[] args) {
        int rsl = MultiMax.compare(1, 1, 1);
        System.out.println(rsl);

    }
}
