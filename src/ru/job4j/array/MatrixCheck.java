package ru.job4j.array;

public class MatrixCheck {
    // Моно строка в матрице
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

    // Моно столбец в матрице
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

    // extractDiagonal В этом задании вам нужен только один цикл for с индексом. Элементы диагонали будут иметь одинаковое значение индексов.
    //Диагональю в этом задании считается элементы лежащие на линии, проведенной от левого верхнего угла в нижний правый.
    //Массив board всегда имеет нечетное число элементов
    public static char[] extractDiagonal(char[][] bord) {
        char[] rsl = new char[bord.length];
        for (int i = 0; i < bord.length; i++) {
            rsl[i] = bord[i][i];
        }
        return rsl;
    }

       /* Метод должен проверить, что в квадратном массиве есть строчки или столбцы, заполненные только символом 'X'
       При любой выигрышной комбинации элементы всегда пересекают диагональ. Это дает нам возможность сократить количество проходов.
Мы определяем координаты элемента в диагонали и проверяем вертикальную и горизонтальную линии.

Чтобы пройти по диагонали двухмерного массива, нам нужен цикл for c index.
Когда мы нашли, что ячейка содержит элемент 'X', нам нужно проверить, что все элементы в строке или в столбце содержат элементы 'X'.
        */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
