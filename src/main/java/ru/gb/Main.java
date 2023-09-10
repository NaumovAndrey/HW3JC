package ru.gb;

public class Main {
    public static void main(String[] args) {
        Empliyee empliyee_0 = Empliyee.getInstance();
        Empliyee empliyee_1 = Empliyee.getInstance();
        Empliyee empliyee_2 = Empliyee.getInstance();

        System.out.println(empliyee_0.toString());
        System.out.println(empliyee_1.toString());
        System.out.println(empliyee_2);
    }
}