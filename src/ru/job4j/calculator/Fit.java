package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        double idealMan = (height - 100) * 1.15;
        return idealMan;

    }
    public static double womanWeight(short height){
        double idealWoman = (height - 110) * 1.15;
        return idealWoman;

    }
    public static void main(String [] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 has ideal weight: " + man);

        height = 164;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 164 has ideal weight: " + woman);



    }
}
