package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Prompt {
    private final Scanner scanner;

    Prompt(Scanner scanner) {
        this.scanner = scanner;
    }

    public String ask(String prompt) {
        System.out.print(prompt);
        return this.scanner.next();
    }
    public BigDecimal askBigDecimal(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextBigDecimal()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        return this.scanner.nextBigDecimal();
    }
    public double askDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        return this.scanner.nextDouble();
    }
    public float askFloat(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextFloat()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        return this.scanner.nextFloat();
    }
    public int askInt(String prompt) {

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        return this.scanner.nextInt();
    }


}
