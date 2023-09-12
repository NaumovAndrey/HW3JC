package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee{
    protected Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public static Employee getInstance2() {
        return new Freelancer(
                names[random.nextInt(surnames.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextInt(800, 2500) * 20.8 * 8);
    }

    public static List<Employee> getEmployees2(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++){
            employees.add(getInstance2());
        }
        return employees;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер  зарплата : %.2f (руб.)",
                getSurName(), getName(), calculateSalary());
    }
}
