import java.math.BigDecimal;
import java.util.Scanner;

public class Prompt {
    private final Scanner scanner;

    Prompt(Scanner scanner) {
        this.scanner = scanner;
    }

    public String ask(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextLine()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        String toReturn = this.scanner.nextLine();
        return toReturn;
    }
    public BigDecimal askBigDecimal(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextBigDecimal()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }

        BigDecimal toReturn = this.scanner.nextBigDecimal();
        this.scanner.next();
        return toReturn;
    }
    public double askDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        double toReturn = this.scanner.nextDouble();
        this.scanner.next();
        return toReturn;
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
        int toReturn = this.scanner.nextInt();
        this.scanner.next();
        return toReturn;
    }

    public boolean askBool(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextBoolean()) {
            scanner.next();
            System.out.print("Invalid value, ");
            System.out.print(prompt);
        }
        boolean toReturn = this.scanner.nextBoolean();
        this.scanner.next();
        return toReturn;
    }


}
