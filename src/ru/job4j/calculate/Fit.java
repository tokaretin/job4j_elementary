package ru.job4j.calculate;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 192;
        double man = Fit.manWeight(height);
        System.out.println("Man 192 is " + man);

        short height1 = 177;
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 177 is " + woman);

    }
}
