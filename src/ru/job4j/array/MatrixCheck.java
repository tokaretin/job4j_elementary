package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j = 0; j < board[column].length; j++) {
            if (board[j][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] bord) {
        char[] rsl = new char[bord.length];
        for (int i = 0; i < bord.length; i++) {
            rsl[i] = bord[i][i];
        }
        return rsl;
    }
}
