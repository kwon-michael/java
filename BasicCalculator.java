import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator!");

        while (true) {
            System.out.println("\nPlease choose an operation:");
            System.out.println("1) Addition (+)");
            System.out.println("2) Subtraction (-)");
            System.out.println("3) Multiplication (*)");
            System.out.println("4) Division (/)");
            System.out.println("5) Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f\n", add(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.printf("Result: %.2f\n", subtract(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.printf("Result: %.2f\n", multiply(firstNumber, secondNumber));
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.printf("Result: %.2f\n", divide(firstNumber, secondNumber));
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
                    break;
            }
        }
        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN; // Not a Number
        }
    }
}