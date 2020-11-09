package ru.job4j.loop;

public class Board {
    public static String paint(int widht, int height) {
        for (int row = 0; row < height; row = row + 1) {
            for (int cell = 0; cell < widht; cell = cell + 1) {

                if (row % 2 == 0) {
                    System.out.print("X");
                } else if (cell % 2 == 0) {
                    System.out.print("_");
                }
                System.out.println(" ");
            }
        }
        return paint;
    }


    public static void main(String[] args) {
        System.out.print(Board.paint(3, 3));
        System.out.println(" ");
        System.out.print(Board.paint(4, 4));

    }

}
