package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i <= number / 2; i++) {
            int temp = number % i;
            if (temp == 0) {
                System.out.println(number + " is not a prime");
                prime = false;
            } else {
                System.out.println(number + " is a prime");
            }
            break;
        }

        return prime;
    }

    public static void main(String[] args) {
        boolean prime = CheckPrimeNumber.check(10);

    }

}




