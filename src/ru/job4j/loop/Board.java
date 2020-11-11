package ru.job4j.loop;

public class Board {
    public static void paint(int widht, int height) {
        for (int row = 0; row < height; row = row + 1) {
            for (int cell = 0; cell < widht; cell = cell + 1) {

                if ((row + cell) % 2 == 0) {
                    System.out.print("|X|");
                } else {
                    System.out.print("|_|");
                }

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println(" =========== ");
        paint(4, 4);

    }

}
