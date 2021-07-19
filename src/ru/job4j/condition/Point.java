package ru.job4j.condition;

public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        double xr1 = x2 - x1;
        double yr2 = y2 - y1;
        double first = Math.pow(xr1, 2);
        double second = Math.pow(yr2, 2);
        double plus = first + second;
        double equals = Math.sqrt(plus);
        return equals;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

