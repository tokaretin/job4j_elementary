package ru.job4j.array;

public class Defragment {
        public static String[] compress(String[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    int point = i; /* указатель на null ячейку. */
                    /* переместить первую не null ячейку. Нужен цикл. */
                    while (point < array.length) {
                        if (array[point] != null) {
                            String temp = array[point];
                            array[point] = array[i];
                            array[i] = temp;
                            break;
                        }
                        point++;
                    }
            }
            System.out.print(array[i] + " ");
        }
            return array;
    }
        public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int i = 0; i < compressed.length; i++) {

                System.out.print(compressed[i] + " ");
            }
        }
    }