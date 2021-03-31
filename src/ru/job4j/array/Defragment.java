package ru.job4j.array;

public class Defragment {
        public static String[] compress(String[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    int point = i; /* указатель на null ячейку. */
                    /* переместить первую не null ячейку. Нужен цикл. */
                    for (int i1 = point + 1; i1 < array.length; i1++) {
                        if (array[i1] != null) {
                            String temp = array[i1];
                            array[i1] = array[i];
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