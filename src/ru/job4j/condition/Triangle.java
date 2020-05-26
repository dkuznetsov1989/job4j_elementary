package ru.job4j.condition;

public class Triangle {
    public static boolean exists(double ab, double ac, double bc) {
        boolean result = (((ab+ac)>bc) && ((ac+bc)>ab) && ((ab+bc)>ac)) ? true : false;
        return result;
    }
}

