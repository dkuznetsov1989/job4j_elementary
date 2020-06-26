package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int a = 0; a <= board.length - 1; a++) {
            if (board[row][a] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int b = 0; b <= board.length - 1; b++) {
            if (board[b][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int c = 0; c < board.length; c++) {
            rsl[c] = board[c][c];
            }
        return rsl;
    }
}
