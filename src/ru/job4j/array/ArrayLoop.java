package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] function = new int[5];
        for (int i = 0; i < function.length; i++) {
            function[i] = i * 2 + 3;
        }

        // цикл for с index
        for (int i = 0; i < function.length; i++) {
            System.out.println(function[i]);
        }
        System.out.println();

        // цикл for-each
        for (int i : function) {
            System.out.println(i);
        }
    }
}
