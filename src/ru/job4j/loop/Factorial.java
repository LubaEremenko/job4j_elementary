package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i = i + 1) {
            rsl = rsl * i;
                    }
        return rsl;

    }

    public static void main(String[] args) {
        System.out.println(calc(1));

    }

}
