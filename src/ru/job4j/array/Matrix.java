package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        return table;
    }
}

/*
public class Matrix {
    // public static int[][] multiple(int size){
    //   int[][] table = new int[size][size];
    public static void main(String[] args) {
        int[][] table = new int[9][9];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

 */
