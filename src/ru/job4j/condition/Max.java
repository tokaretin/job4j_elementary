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

    public static int max(int x1, int x2, int x3, int x4) {
        return max(x1, max(x2, x3, x4)
        );
    }

    public static void main(String[] args) {
        int rsl = Max.max(5, 3);
        System.out.println(rsl);
        int result = Max.max(9, max(5, 8));
        System.out.println(result);
        int rsl2 = Max.max(10, max(22, 15));
        System.out.println(rsl2);
        int rsl3 = Max.max(10, max(31, 33));
        System.out.println(rsl3);
        int rsl4 = Max.max(20, max(13, 14, 15));
        System.out.println(rsl4);
        int rsl5 = Max.max(12, max(16, 14, 15));
        System.out.println(rsl5);
        int rsl6 = Max.max(12, max(16, 17, 15));
        System.out.println(rsl6);
        int rsl7 = Max.max(12, max(16, 17, 18));
        System.out.println(rsl7);
    }
}