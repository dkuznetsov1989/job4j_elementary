package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int a = 0; a < board.length; a++) {
            if (board[row][a] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int b = 0; b < board.length; b++) {
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

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
