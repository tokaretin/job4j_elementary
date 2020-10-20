package ru.job4j.ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        //сравнить, что first больше second
        boolean result1 = first > second;
        System.out.println("result1 = " + result1);
        //сравнить, что first меньше second
        boolean result2 = first < second;
        System.out.println("result2 = " + result2);
        //сравнить, что first равна second
        boolean result3 = first == second;
        System.out.println("result3 = " + result3);
    }
}
