package ru.job4j.array;

import java.util.Arrays;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int a = 0; a < pref.length; a++) {
                if (pref[a] != word[a]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}