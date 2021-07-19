package ru.job4j.condition;

public class Max {
    public static int max(int x1, int x2) {
        int max = x1 >= x2 ? x1 : x2;
        return max;
    }

    public static int max(int x1, int x2, int x3) {
        return max(x1, max(x2, x3)
        );
    }

    public static void main(String[] args) {
        int rsl = Max.max(5, 3);
        System.out.println(rsl);
        int result = Max.max(9, max(5, 8));
        System.out.println(result);
        int rsl2 = Max.max(10,  max(22, 15));
        System.out.println(rsl2);
        int rsl3 = Max.max(10,  max(31, 33));
        System.out.println(rsl3);
    }
}