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
        names[0] = "Simona";
        names[1] = "Ilia";
        names[2] = "Lev";
        names[3] = "Anastasia";
        System.out.println("Размер массива String[] names равен: " + names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
