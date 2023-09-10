package ru.gb;

public class Worker extends Empliyee{
    public Worker(String name, String surName) {
        super(name, surName);
    }

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public static Empliyee getInstance() {
        return new Worker(
                names[random.nextInt(surnames.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextInt(130000, 250000));
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная зарплата (фиксированная месячная оплата): %.2f (руб.)",
                getSurName(), getName(), salary);
    }
}
