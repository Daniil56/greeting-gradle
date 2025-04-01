package ru.mentee.power.variables;

public class Modify {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);
        System.out.println(modify(number));
        System.out.println(number);

    }

    public static int modify(int number) {
        return number = 100;
    }
}
