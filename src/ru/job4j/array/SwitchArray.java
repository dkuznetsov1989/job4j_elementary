package ru.job4j.array;

import com.sun.source.util.SourcePositions;

public class SwitchArray {
    public static int[] swapBordeer(int[] array) {
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBordeer(nums);
        for (int index = 0; index < rsl.length; index++)
            System.out.println(rsl[index]);
    }
}
