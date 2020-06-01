package ru.job4j.converter;

/**
 * Конвертация
 *
 * "author Dmitry Kuznetsov
 * @since 01.06.2020
 * @version 1
 */

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubbleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main
     * @param args - args.
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubbleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : "+ passed);
        out = rubbleToDollar(in);
        System.out.println("140 rubles are 2 dollar. Test result : "+ passed);
    }
}
