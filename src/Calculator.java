//import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[0] = 1;
//        a[1] = 2;
//        System.out.println(Arrays.toString(a));
//    }
//}


//import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args) {
//        int[] numbers = {2,3,4,1,5};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }
//}

//import java.util.Scanner;
//
//public class Array {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Prompt user for input
//        System.out.print("Enter employee's name: ");
//        String name = input.nextLine();
//
//        System.out.print("Enter number of hours worked in a week: ");
//        double hoursWorked = input.nextDouble();
//
//        System.out.print("Enter hourly pay rate: ");
//        double hourlyRate = input.nextDouble();
//
//        System.out.print("Enter federal tax withholding rate (as a decimal): ");
//        double federalTaxRate = input.nextDouble();
//
//        System.out.print("Enter state tax withholding rate (as a decimal): ");
//        double stateTaxRate = input.nextDouble();
//
//        // Calculations
//        double grossPay = hoursWorked * hourlyRate;
//        double federalWithholding = grossPay * federalTaxRate;
//        double stateWithholding = grossPay * stateTaxRate;
//        double totalDeduction = federalWithholding + stateWithholding;
//        double netPay = grossPay - totalDeduction;
//
//        // Display output
//        System.out.println("\nEmployee Name: " + name);
//        System.out.println("Hours Worked: " + hoursWorked);
//        System.out.println("Pay Rate: $" + hourlyRate);
//        System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));
//        System.out.println("Deductions:");
//        System.out.println("  Federal Withholding (" + (federalTaxRate * 100) + "%): $" + String.format("%.2f", federalWithholding));
//        System.out.println("  State Withholding (" + (stateTaxRate * 100) + "%): $" + String.format("%.2f", stateWithholding));
//        System.out.println("  Total Deduction: $" + String.format("%.2f", totalDeduction));
//        System.out.println("Net Pay: $" + String.format("%.2f", netPay));
//
//        input.close();
//    }
//}

//public class Array {
//    public static void main(String[] args) {
//        int z = max(1,2);
//        System.out.println(z);
//
//    }
//    public static int max (int num1 , int num2) {
//        int result;
//        if (num1 > num2)
//            result = num1;
//        else
//            result = num2;
//        return result;
//    }
//}
//
//public class Array {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
//        int c = max(a,b);
//        System.out.println(a+b+c );
//    }
//    public static int max (int num1 , int num2) {
//        int result;
//        if (num1 > num2)
//            result =num1;
//
//        else
//            result =num2;
//        return result;
//    }
//}

//import java.util.Scanner;
//
//public class Array {
//    public static void main(String[] args) {
//        int operator, n1 ,n2;
//        System.out.println("1 - add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide \n");
//        System.out.print("Enter the operator: ");
//        Scanner input = new Scanner(System.in);
//        operator = input.nextInt();
//        System.out.print("Enter the first number: ");
//        n1 = input.nextInt();
//        System.out.print("Enter the second number: ");
//        n2 = input.nextInt();
//        switch (operator) {
//            case 1 -> n1 += n2;
//            case 2 -> n2 -= n1;
//            case 3 -> n1 *= n2;
//            case 4 -> n1 /= n2;
//            default -> System.out.println("Invalid operator");
//
//
//
//        }
//        System.out.println("The result is: " + n1);
//        input.close();
//
//
//
//    }
//
//}
//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        int operator, n1, n2;
//        System.out.print("Enter the operator (+, -, * ,/): ");
//
//
//
//        Scanner input = new Scanner(System.in);
//        operator = input.nextInt();
//
//        System.out.print("Enter the first number: ");
//        n1 = input.nextInt();
//
//
//        System.out.print("Enter the operator (+, -, * ,/): ");
//        operator = input.nextInt();
//
//        System.out.print("Enter the second number: ");
//        n2 = input.nextInt();
//
//        switch (operator) {
//            case 1 -> n1 += n2;
//            case 2 -> n1 -= n2;  // Fixed subtraction
//            case 3 -> n1 *= n2;
//            case 4 -> {
//                if (n2 == 0) {
//                    System.out.println("Error: Division by zero is not allowed.");
//                    return;  // Exit program if division by zero occurs
//                }
//                n1 /= n2;  // Integer division
//            }
//            default -> {
//                System.out.println("Invalid operator");
//                return;  // Exit program if invalid input
//            }
//        }
//
//        System.out.println("The result is: " + n1);
//        input.close();
//    }
//}

//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        double n1, n2, result = 0;
//        char operator;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        n1 = input.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /): ");
//        operator = input.next().charAt(0);
//
//        System.out.print("Enter the second number: ");
//        n2 = input.nextDouble();
//
//        switch (operator) {
//            case '+' -> result = n1 + n2;
//            case '-' -> result = n1 - n2;
//            case '*' -> result = n1 * n2;
//            case '/' -> {
//                if (n2 == 0) {
//                    System.out.println("Error: Division by zero is not allowed.");
//                    input.close();
//                    return;
//                }
//                result = n1 / n2;
//            }
//            default -> {
//                System.out.println("Invalid operator. Please use +, -, *, or /.");
//                input.close();
//                return;
//            }
//        }
//
//        System.out.println("The result is: " + result);
//        input.close();
//    }
//}


//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            System.out.print("Enter the num1: ");
//            double num1 = scanner.nextDouble();
//            char [] operators = {'+', '-', '*', '/'};
//            System.out.print("Enter the operator: ");
//            char operator = scanner.next().charAt(0);
//            System.out.print("Enter the num2: ");
//            double num2 = scanner.nextDouble();
//            double result;
//
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    System.out.println(result);
//                    break;
//
//                case '-':
//                    result = num1 - num2;
//                    System.out.println(result);
//                    break;
//
//                case '*':
//                    result = num1 * num2;
//                    System.out.println(result);
//                    break;
//
//                case '/':
//                    if (num2 != 0) {
//                        result = num1 / num2;
//                        System.out.println(result);
//                    } else {
//                        System.out.println("Cannot divide by zero!");
//                    }
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("List of operators: + - * /");
//
//        System.out.print("Enter the num1: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Enter the num2: ");
//        double num2 = scanner.nextDouble();
//
//        while (true) {
//            char[] operators = {'+', '-', '*', '/'};
//            System.out.print("Enter the operator: ");
//            char operator = scanner.next().charAt(0);
//            double result;
//
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    System.out.printf("%.2f\n", result);
//                    break;
//
//                case '-':
//                    result = num1 - num2;
//                    System.out.printf("%.2f\n", result);
//                    break;
//
//                case '*':
//                    result = num1 * num2;
//                    System.out.printf("%.2f\n", result);
//                    break;
//
//                case '/':
//                    if (num2 != 0) {
//                        result = num1 / num2;
//                        System.out.printf("%.2f\n", result);
//                    } else {
//                        System.out.println("Cannot divide by zero!");
//                        break;
//                    }
//            }
//            System.out.print("Do you want to continue with the same numbers? (yes/no): ");
//            String answer = scanner.next();
//            if (answer.equalsIgnoreCase("yes")) {
//                System.out.print("Enter another num1: ");
//                num1 = scanner.nextDouble();
//                System.out.print("Enter another num2: ");
//                num2 = scanner.nextDouble();
//            } else if (answer.equalsIgnoreCase("no")) {
//                System.out.print("That's all");
//                break;
//            } else {
//                System.out.println("stop");
//
//            }
//        }
//    }
//}

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
