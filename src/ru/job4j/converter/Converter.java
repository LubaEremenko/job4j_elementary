package ru.job4j.converter;

import java.util.concurrent.Callable;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl1 = value / 70;
        return rsl1;
    }

     public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;

    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 dollar. Test result: " + passed);

                    }
        }

