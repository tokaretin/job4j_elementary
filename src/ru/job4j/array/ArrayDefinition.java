package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива short[] ages равен: " + ages.length);
        System.out.println("Размер массива String[] surnames равен: " + surnames.length);
        System.out.println("Размер массива float[] prices равен: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Ivan";
        names[2] = "Fedor";
        names[3] = "Nikolay";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
