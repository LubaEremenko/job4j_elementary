package ru.job4j.condition;

import java.net.PortUnreachableException;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args)    {

        double result = TrgArea.area(2, 2, 2);
        System.out.println("The area of a triangle with sides a=2, b=2, c=2 is " + result);
    }
}
