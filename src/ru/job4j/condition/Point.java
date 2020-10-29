package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double distinctionX = x2 - x1;
        double distinctionY = y2 - y1;

        double first = Math.pow(distinctionX, 2);
        double second = Math.pow(distinctionY, 2);

        double sum = first + second;
        double dist = Math.sqrt(sum);
        return dist;

    }
    public static void main(String[] args){
      double result = Point.distance(0, 0,2,0);
      System.out.println("The distance between two points A (0,0) and B (2,0) is " + result);

    }


}

