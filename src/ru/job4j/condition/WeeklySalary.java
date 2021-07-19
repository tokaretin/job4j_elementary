package ru.job4j.condition;

/**
 * Метод принимает массив целочисленных значений, при этом каждый элемент массива означает
 * количество часов, которые работник отработал в каждый день недели. Работник может работать и в выходные.
 * При этом оплачивается труд следующим образом:
 * 1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.
 * 2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.
 * 3. В выходные дни работодатель платит в два раза больше, как за каждый час по норме(первые 8 часов), так и сверхурочные.
 * Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 */
public class WeeklySalary {
    public static int calculate(int[] hours) {
        int moneyAllDay = 0;
        for (int i = 0; i < hours.length; i++) {
            int money15 = 0;
            int money10 = 0;
            if (hours[i] > 8) {
                money15 = hours[i] - 8;
            }
            money10 = hours[i] - money15;
            int moneyWorkDay = 0;
            moneyWorkDay = money10 * 10 + money15 * 15;
            if (i > 4) {
                moneyWorkDay *= 2;
            }
            moneyAllDay += moneyWorkDay;
        }
        return moneyAllDay;
    }
}