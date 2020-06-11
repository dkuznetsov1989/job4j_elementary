package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int a = start; a <= finish; a++) {
            if (min > array[a]) {
              min = array[a];
            }
        }
        return min;
    }
}
