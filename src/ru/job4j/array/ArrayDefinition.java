package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Иван Иванов, ";
        names[1] = "Петр Петров, ";
        names[2] = "Василий Пупкин, ";
        names[3] = "Исидор Залупкин.";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
