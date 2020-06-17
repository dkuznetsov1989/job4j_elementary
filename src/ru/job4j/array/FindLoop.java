package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < el; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int j = start; j <= finish; j++) {
            if (data[j] == el) {
                rsl = j;
                break;
            }
        }
        return rsl;
    }
}
