package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee {

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public static Employee getInstance() {
        return new Worker(
                names[random.nextInt(surnames.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextInt(130000, 250000));
    }

    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++){
            employees.add(getInstance());
        }
        return employees;
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
