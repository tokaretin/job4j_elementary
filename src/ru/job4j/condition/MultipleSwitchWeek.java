package ru.job4j.condition;

import org.graalvm.compiler.serviceprovider.IsolateUtil;

public class MultipleSwitchWeek {
    public static int numofday(String name) {
        return switch(name) {
            case "Понедельник" -> 1;
            case "Вторник" -> 2;
            case "Среда" -> 3;
            case "Четверг" -> 4;
            case "Пятница" -> 5;
            case "Суббота" -> 6;
            case "Воскресенье" -> 7;
            default -> -1;
        };
    }

        public static void main (String... args) {
            System.out.println(numofday("Четверг"));
        }
    }
