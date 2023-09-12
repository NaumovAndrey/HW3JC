package ru.gb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Freelancer("Ivan", "Ivanov", 800);
//        System.out.println(employee);
//
//        Employee employee2 = new Worker("Ivan", "Ivanov", 10);
//        System.out.println(employee2);
        List<Employee> employees = Worker.getEmployees(5);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        //region фрилансер
        List<Employee> employees2 = Freelancer.getEmployees2(15);
        for (Employee employee : employees2) {
            System.out.println(employee);
        }

//        Collections.sort(employees2, new EmployeeNameComparator());
//        System.out.println();
//
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
        //endregion
    }
}