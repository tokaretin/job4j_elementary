//package ru.job4j.array;
//
//
//public class Defragment {
//        public static String[] compress(String[] array) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == null) {
//                    int point = i; /* указатель на null ячейку. */
//                    /* переместить первую не null ячейку. Нужен цикл. */
////                    while (point < array.length - 1) {
////                        point++;
////                    }
////                    if (array[point] != null) {
////                        String temp = array[point];
////                        array[point] = array[i + 1];
////                        array[i + 1] = temp;
////                        break;
////                    }
//                    for (int i = point; i < array.length - 1; i++) {
//                    if (array[i] != null) {
//                        int temp = array[point]; /* указатель на notNullIndex ячейку */
//                        array[point] = array[i + 1]; /* записали в ячеку с null значение notNellIndex ячейки */
//                        array[i + 1] = temp; /* поменяли местами */
//                    }
//                }
//            }
//            System.out.print(array[i] + " ");
//        }
//            return array;
//    }
//        public static void main(String[] args) {
//            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
//            String[] compressed = compress(input);
//            System.out.println();
//            for (int i = 0; i < compressed.length; i++) {
//
//                System.out.print(compressed[i] + " ");
//            }
//        }
//    }
//
