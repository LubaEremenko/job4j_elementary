package ru.job4j.loop;

public class Mortgage {
    public static int data(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (int) (amount + amount * percent / 100 - salary);
            year = year + 1;
        }
        return year;

    }

    public static void main(String[] arg) {
        double year = Mortgage.data(100, 120, 50);
        System.out.println("На выплату кредита потребуется " + year + " годa.");

    }

}
