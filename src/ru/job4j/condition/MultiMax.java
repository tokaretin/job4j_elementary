package ru.job4j.condition;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MultiMax {

    public static int max(int first, int second, int third) {

        int result = second;
        if (first > second) {
            if (first > third)
                result = first;
        } else if (second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
}

// Второй вариант с &&
//  и

//    public static int max(int first, int second, int third) {
//
//        int result = first;
//        if (first > second && first > third) {
//                result = first;
//        } else if (second > third && second > first) {
//            result = second;
//        } else {
//            result = third;
//        }
//        return result;
//    }
//}
