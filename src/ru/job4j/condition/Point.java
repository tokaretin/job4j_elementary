package ru.job4j.condition;

public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        //double rsl = -1;
        double xr1 = x2 - x1;               //1. Вычесть аргументы x2 и x1.
        double yr2 = y2 - y1;               //2. Вычесть аргументы y2 и y1.
        double first = Math.pow(xr1, 2);    //3. Возвести в степень 2 результат операции 1.
        double second = Math.pow(yr2, 2);   //4. Возвести в степень 2 результат операции 2.
        double plus = first + second;       //5. Сложить результаты операций 3 и 4.
        double equals = Math.sqrt(plus);    //6. Вычислить корень квадратный из результата операции 5.
        return equals;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
