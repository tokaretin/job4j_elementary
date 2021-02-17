package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                rsl += val;
            }
        }
        return rsl;
    }
}

/*
// сумма всех элементов в массиве
public class MatrixSum {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int sum = 0;
        for (int row = 0; row <= array.length; row++) {
            for (int cell = 0; cell <= array[row].length; cell++) {
                int val = array[row][cell];
                //System.out.println(val);
                sum += val;
                System.out.println("сумма " + sum);
            }
        }
    }
}

*/




