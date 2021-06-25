package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        /** Если элемента нет в массиве, то возвращаем -1.
         */
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOff(int[] data, int el, int start, int finish) {
        /** Если нет элемента в мвссиве то возвращаем -1
         */
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
