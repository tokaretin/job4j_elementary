package ru.job4j.ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double heighт = p / (2 * (k + 1));
        double lenght = heighт * k;
        double rectangle = lenght * heighт;
        return rectangle;

    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 2, k = 2, s = 2 reale = " + result);
    }
}
