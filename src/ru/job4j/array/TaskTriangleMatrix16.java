package ru.job4j.array;

/**
 * 16. Заполнить треугольную матрицу
 * Треугольная матрица, это матрица вида:
 * 1
 * 2 3
 * 4 5 6
 * Вам дано количество строк в результирующей матрице. Вам нужно заполнить ее.
 * Например, для 1
 * {{1}}
 * Для 2
 * {
 * {1}
 * {2, 3}
 * }
 * и т.д.
 */

public class TaskTriangleMatrix16 {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int count1 = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            System.out.println();
            System.out.println(triangle[i].length + " ");
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = count1++;
                System.out.println(triangle[i][j]);
            }
        }
        return triangle;
    }
}
