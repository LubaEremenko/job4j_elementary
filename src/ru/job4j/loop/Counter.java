package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(2, 9));
        System.out.println(sum(36, 39));
        System.out.println(sum(1, 1));
    }

}
