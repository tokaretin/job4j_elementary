package ru.job4j.array;

/**
 * 11. Создание неоднородного двумерного массива.
 * Познакомимся как создать массив в котором количество элементов в каждом ряду отличается от количества рядов в массиве.
 * Такой массив называется неоднородным и создается следующим образом (например заполним массив целочисленными значениями):
 * int[][] array = new int[][]{{0, 1}, {10, 20, 30}, {5}, {1, 2, 3, 4, 5}};
 * Необходимо напомнить, что для определения количества элементов в ряду, необходимо указать индекс ряда и вызвать поле length.
 * В задании необходимо расскомментировать код, заполнить массив значениями от 1 до 6, при этом:
 * 1. Разбить значения на 3 массива.
 * 2. В первом должен быть 1 элемент, втором - 2 элемента, третьем - 3 элемента.
 */

public class TaskNonSquareArray11 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{11}, {22, 33}, {44, 55, 66, 77}};
        /** Выводится количество элементов в ряду,
         *
         */
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            System.out.print(array[i].length + " ");
            /** потом с новой строки элементы ряда через пробел, потом все повторяется
             *
             */
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}

