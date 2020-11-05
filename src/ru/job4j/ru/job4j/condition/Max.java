package ru.job4j.ru.job4j.condition;

public class Max {
    public static int max(int x1, int x2) {
        int max = x1 >= x2 ? x1 : x2;

        //ТИП_ПЕРЕМЕННОЙ - int
        // ИМЯ_ПЕРЕМЕННОЙ - max
        // =
        // ЛОГИЧЕСКОЕ_ВЫРАЖЕНИЕ - x1 >= x2
        // ?
        // ЗНАЧЕНИЕ_1 - x1
        // :
        // ЗНАЧЕНИЕ_2; - x2
        return max;
    }

    public static void main(String[] args) {
        int rsl = Max.max(5, 3);
        System.out.println(rsl);
    }
}