package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i <= number / 2; i++) {
            int temp = number % i;
            if (temp == 0) {
                prime = false;
                break;

            }
        }
        return prime;

        }

    public static void main(String[] args) {
        boolean prime = CheckPrimeNumber.check(10);
        System.out.println(prime);

    }

}




