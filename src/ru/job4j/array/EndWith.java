package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int a = 0; a < post.length; a++) {
            if (post[post.length - a - 1] != word[word.length - a - 1]) {
                        result = false;
                        break;
            }
        }
        return result;
    }
}
