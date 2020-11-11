package ru.job4j.loop;

public class Fitness {
    public static int lift(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ++month;
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return month;

    }

    public static void main(String[] args) {
        int month = Fitness.lift(50, 90);
        System.out.println("Kоличество, месяцев за которые Иван обгонит в тяге Николая: " + month);

    }

}
