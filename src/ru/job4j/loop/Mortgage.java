package ru.job4j.loop;

public class Mortgage {
    public static double year(double amount, double salary, double percent) {
        double year = 0;
        double temp, tempNextYear;
        while (double reminderPreviousYear <= 0) {
            temp = amount * percent;
            reminderPreviousYear = temp - salary;
            tempNextYear = reminderPreviousYear * percent + reminderPreviousYear;

        }
        return year;

    }

    public static void main(String[] arg) {
        double year = Mortgage.year(100, 70, 50);
        System.out.println("На выплату кредита потребуется " + year + "года/лет.");

    }


}
