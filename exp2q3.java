import java.util.Scanner;

public class exp2q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Performing operations based on user input
            switch (operator) {
                case "+":
                    System.out.println("Sum: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Difference: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Product: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0)
                        System.out.println("Quotient: " + (num1 / num2));
                    else
                        System.out.println("Error: Division by zero is not allowed.");
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numbers correctly.");
        } finally {
            scanner.close(); // Closing the scanner to prevent memory leaks
        }
    }
}
