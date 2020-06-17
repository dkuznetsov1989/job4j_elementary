package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int a = 0; a <= size-1; a++) {
            for (int b = 0; b <= size-1; b++) {
                table[a][b] = (a+1)*(b+1);
            }
        }
        return table;
    }
}
