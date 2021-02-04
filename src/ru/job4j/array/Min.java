package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
//            if (min < array[1]) {
//                return min;
//                }
//                if (array[1] < array[2]) {
//                    min = array[1];
//                }
//                if (array[2] < array[1]) {
//                    min = array[2];
            }
        }
                return min;
            }
        }
