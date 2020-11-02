package ru.job4j.condition;

import java.util.concurrent.Callable;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is: " + age);
        if (age >= 21) {
    System.out.println("Welcome to the cinema");
    } else {
            System.out.println("It is not for you");
        }
    }

    public static void main(String[] args) {
        Cinema.access(10);
        Cinema.access(34);

            }
        }

