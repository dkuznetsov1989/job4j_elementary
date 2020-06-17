package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int a = 0; a < data.length; a++) {
            int min = MinDiapason.findMin(data, a, data.length-1);
            int index = FindLoop.indexOf(data, min, a, data.length-1);
            int b = data[a];
            data[a] = data[index];
            data[index] = b;
        }
        return data;
    }
}
