package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            rsl[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            rsl[k] = right[j];
            j++;
            k++;
        }
        return rsl;
    }
// O(1) - constsnt (Константная сложность)
    public static void main(String[] args) {
        int[] left = {1, 3, 7};
        int[] right = {2, 4};
        int[] rsl = merge(left, right);
        System.out.println(Arrays.toString(rsl));
    }
}
