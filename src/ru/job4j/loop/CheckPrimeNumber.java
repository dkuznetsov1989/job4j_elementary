
package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        if (number == 2) {
            prime = true;
        }
        for (int index =1; index <=number; index ++) {
            if ((number%index) == 1) {
                prime = true;
            } else
            if ((number%2) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}