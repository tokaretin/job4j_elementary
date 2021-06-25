package ru.job4j.calculate;

public class Calculator {
    public static void minus(int t, int r, int e) {
        int g = t - r - e;
        System.out.println(g);
    }

    public static void main(String[] args) {
        Calculator.minus(100, 50, 49);
    }
}