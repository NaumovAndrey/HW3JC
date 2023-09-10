package ru.gb;

import java.util.Random;

public abstract class Empliyee {

    private static Random random = new Random();
    private static String[] names = new String[] {"Андрей", "Александр", "Николай", "Алексей", "Владимир", "Максим", "Вячеслав"};
    private static String[] surnames = new String[] {"Наумов", "Путин", "Толстой", "Пушкин", "Лермонтов", "Некрасов"};
    private static int counter = 0;

    /**
     * Идентификатор сотрудника
     */
    private int id;

    /**
     * Имя
     */
    private final String name;
    /**
     * Фамилия
     */
    private final String surName;

    /**
     * Ставка заработной платы
     */
    private double salary;

    {
        id = ++counter;
    }

    private Empliyee() {
        this("#Name#", "#Surname");
    }

    private Empliyee(String name, String surName) {
        this(name, surName, 0);
    }

    private Empliyee(String name, String surName, double salary) {
        if (salary < 0){
            throw new RuntimeException("Уровеь заработной платы не корректен");
        }
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    private int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            throw new RuntimeException("Уровеь заработной платы не корректен");
        }
        this.salary = salary;
    }

    public static Empliyee getInstance(){
        return new Empliyee(
                names[random.nextInt(surnames.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextInt(130000, 250000));

    }

    /**
     * Пасчёт среднемесячной оплаты
     *
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Empliyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
