package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int degree = 1;
        for (int i = 1; i <= n; i++) {
            degree = degree * a;
        }
        return degree;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2,2));
    }
}
