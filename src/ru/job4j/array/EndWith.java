package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int a = word.length-1; a > (word.length-post.length); a--) {
            for (int b = post.length-1; b > 0; b--) {
                if (word[a] != post[b]) {
                        result = false;
                        break;
                }
            }
        }
        return result;
    }
}
