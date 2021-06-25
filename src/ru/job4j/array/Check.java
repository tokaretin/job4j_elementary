package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean temp : data) {
            if (data[0] != temp) {
                return false;
            }
        }
        return true;
    }
}
