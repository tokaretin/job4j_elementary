package ru.job4j.array;
/*
17. Транспонировать матрицу
Транспонирование матрицы, это когда строки исходной матрицы,
становятся столбцами в результирующей матрице

Например,
Вам дана матрица n на m. Ваша задача ее транспонировать
 */
public class TaskTransposition17 {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
