package ru.job4j.calculate;

public class MathFunc {
   public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
/*
    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }
*/

    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
       // int result = result1;
        System.out.println(result1);

        /*
        int result2 = MathFunc.func1(5);
        int total = result1 + result2;
        System.out.println(total);
        */
    }
}
