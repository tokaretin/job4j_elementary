package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        //boolean result = true;
//        boolean temp = data[0];
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] != temp) {
//                return false;
//            }
//        }
//        return result;

        for (boolean temp : data) {
            if (data[0] != temp) {
                return false;
            }
        }
        return true;
    }
}
