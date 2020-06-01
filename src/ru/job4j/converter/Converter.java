package ru.job4j.converter;

/**
 * Конвертация
 *
 * "author Dmitry Kuznetsov (a693kn@yandex.ru)
 */

public class Converter {
    public static int rubleToEuro(int value) {
        /**
         * Convertation ruble to Euro
         */
        int rsl = value / 70;
        return rsl;
    }

    public static int rubbleToDollar(int value) {
        /**
         * Convertation ruble to Dollars
         */
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
