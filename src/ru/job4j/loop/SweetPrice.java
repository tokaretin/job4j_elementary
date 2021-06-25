package ru.job4j.loop;

/** Дано целое число price — цена 1 кг конфет.
 * Вывести стоимость 1, 2, . . . , 5 кг конфет.
 */

public class SweetPrice {
    public static void out(int price) {
        int summa = 0;
        for (int i = 1; i <= 5; i++) {
            summa = price * i;
            System.out.println(summa);
        }
    }

    public static void main(String[] args) {
        out(5);
    }
}
