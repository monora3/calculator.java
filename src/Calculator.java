
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayCalculatorMenu();
            char operation = getOperation(scanner);
            if (operation == 'q') {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double num1 = getNumbers(scanner, "Enter the first number: ");
            double num2 = getNumbers(scanner, "Enter the second number: ");

            double result = calculateResult(num1, num2, operation);
            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f\n", result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    public static void displayCalculatorMenu() {
        System.out.println("\nCalculator Menu:");
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        System.out.println("q : Quit");
    }

    public static double getNumbers(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static char getOperation(Scanner scanner) {
        System.out.print("Enter your choice of operation: ");
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != 'q') {
            System.out.println("Invalid operation. Please enter a valid operator (+, -, *, /, q). ");
            System.out.print("Enter your choice of operation: ");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static double calculateResult(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                System.out.println("Invalid operation.");
                return Double.NaN;
        }
    }
}
