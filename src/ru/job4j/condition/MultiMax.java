package ru.job4j.condition;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MultiMax {

    public static int max(int first, int second, int third) {

        int result = first;
        if (second > first) {
            if (second > third) {
                result = second;
            } else {
                result = third;
            }
        } else if (third > first) {
            result = third;
        }
        return result;
    }
}

