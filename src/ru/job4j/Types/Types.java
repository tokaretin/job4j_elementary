package ru.job4j.Types;

public class Types {
    public static void main(String[] args) {
        //byte b = 100;
        //short s = b;
        //int i = s;
        //long l = i;
        //System.out.println("Вывод на консоль после расширения " + l);


        //преобразование, которое происходит с потерей данных.
        System.out.println("Преобразование, которое происходит с потерей данных");
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);

        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);

        double d = 121.19;
        byte bb = (byte) d;
        System.out.println(bb);
        System.out.println();



        //преобразование, которое происходит без потери данных.
        System.out.println("преобразование, которое происходит без потери данных");
        char c = 45000;
        float ii = c;
        System.out.println(ii);

        short s = 1500;
        char cc = (char) s;
        double ddd = cc;
        System.out.println(ddd);
    }
}