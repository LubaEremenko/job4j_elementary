package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }
    
    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println("The area of a rectangle with p=6 and k=2 is " + result);

    }
}
