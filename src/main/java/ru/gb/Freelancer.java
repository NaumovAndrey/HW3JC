package ru.gb;

public class Freelancer extends Employee{
    private double hourlyRate; // ставка (чел/час)
    protected Freelancer(String name, String surName, double hourlyRate) {
        super(name, surName);
        this.hourlyRate = hourlyRate;

    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
