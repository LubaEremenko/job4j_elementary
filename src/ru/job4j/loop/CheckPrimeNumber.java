package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number / 2; i = i + 1) {
            int temp = number / i;
            if ((temp / 2 ) == 0) {
                prime = false;
                break;

            }

        }
        return prime;
    }

    public static void main(String[] args) {
        boolean prime = CheckPrimeNumber.check(5);
        System.out.println(prime);

    }

}




