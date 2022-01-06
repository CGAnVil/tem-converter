package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit + " F equal: " + fToC(fahrenheit) + " C");
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println(celsius + " C equal:" + cToF(celsius) + " F");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double cToF(double celcius) {
        double f = (9.0 / 5) * celcius + 32;
        return f;
    }

    public static double fToC(double fahrenheit) {
        double c = (5.0 / 9) * (fahrenheit - 32);
        return c;
    }
}
