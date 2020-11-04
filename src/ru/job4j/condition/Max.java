package ru.job4j.condition;

public class Max {
    public static int compare(int left, int right) {
        int max = left >= right ? left : right;
        return max;

    }

    public static void main(String[] args) {
        int msg = Max.compare(11, 656);
        System.out.println(msg);
    }
}
