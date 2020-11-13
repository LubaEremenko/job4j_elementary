package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number) == true) {
                count = count + 1;
                System.out.println(finish + " contains " + count + " primes.");

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int count = PrimeNumber.calc(11);
    }
}
