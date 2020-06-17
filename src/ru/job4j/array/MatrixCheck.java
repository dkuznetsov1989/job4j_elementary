package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int a = 0; a <= board.length-1; a++) {
            if (board[row][a] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
