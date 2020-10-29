package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double L = h * k;
        double S = L * h;
        return S;
    }
    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println("The area of a rectangle with a p=6 and a k=2 is " + result);

    }
}
