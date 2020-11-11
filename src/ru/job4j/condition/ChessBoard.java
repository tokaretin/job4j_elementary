package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;

        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            rsl = Math.abs(x1 - x2);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(0, 0, 0, 6));
        System.out.println(way(2, 6, 4, 1));
        System.out.println(way(7, 0, 0, 7));
        System.out.println(way(0, 1, 0, 1));
    }
}

//public class ChessBoard {
//    public static int way(int x1, int y1, int x2, int y2) {
//        int rsl = 0;
//        int minusX = x1 - x2;
//        int minusY = y1 - y2;
//        int absX = Math.abs(minusX);
//        int absY = Math.abs(minusY);
//
//        if (absX == absY) {
//            rsl = Math.abs(x1 - x2);
//        }
//        return rsl;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(way(0, 0, 0, 6));
//        System.out.println(way(2, 6, 4, 1));
//        System.out.println(way(7, 0, 0, 7));
//        System.out.println(way(0, 1, 0, 1));
//    }
//}