package ru.job4j.array;

import java.util.Arrays;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int a = 0; a < pref.length; a++) {
            for (int b = 0; b < pref.length; b++) {
                if (a == b && pref[a] == word[b]) {
                    result = true;
                } else result = false;
            }
        }
        return result;
    }
}