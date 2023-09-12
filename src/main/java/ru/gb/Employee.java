package ru.gb;

import java.util.Random;

public abstract class Employee implements Comparable<Employee>{

    //region Поля
    protected static Random random = new Random();
    protected static String[] names = new String[]{"Андрей", "Александр", "Николай", "Алексей", "Владимир", "Максим", "Вячеслав"};
    protected static String[] surnames = new String[]{"Наумов", "Путин", "Толстой", "Пушкин", "Лермонтов", "Некрасов"};
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
    protected static double salary;

    {
        id = ++counter;
    }
    //endregion

    //region Конструкторы
    private Employee() {
        this("#Name#", "#Surname");
    }

    Employee(String name, String surName) {
        this(name, surName, 0);
    }

    protected Employee(String name, String surName, double salary) {
        if (salary < 0) {
            throw new RuntimeException("Уровеь заработной платы не корректен");
        }
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }
    //endregion

    //region get and set
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
    //endregion

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new RuntimeException("Уровеь заработной платы не корректен");
        }
        this.salary = salary;
    }

    /*public static Empliyee getInstance(){
        return new Empliyee(
                names[random.nextInt(surnames.length)],
                surnames[random.nextInt(surnames.length)],
                random.nextInt(130000, 250000));

    }*/

     /**
     * Расчёт среднемесячной оплаты
     *
     * @return
     */
    public abstract double calculateSalary();

    /**
     * Метод сортировки
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());

    }

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
