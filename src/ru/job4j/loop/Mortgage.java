package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        //amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
        int year = 0;
        while (amount > 0) {
            double amounta = (amount * (percent / 100) + amount);
            double dolg = amounta - salary;
            amount = amounta - salary + dolg;
            year += 1;
        }
        return year;
    }
}
