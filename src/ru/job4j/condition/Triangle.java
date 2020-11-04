package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean rsl = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        return rsl;

    }

    public static void main(String[] args) {
        boolean msg = Triangle.exist(17, 25, 36);
        System.out.println(msg);

    }
}
