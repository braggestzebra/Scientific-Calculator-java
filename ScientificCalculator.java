import java.util.Scanner; // Import Scanner class to take user input
import java.lang.Math; // Import Math class for Scientific functions

public class ScientificCalculator {
    // Method to perform basic arithmetic operations
    public static double basicOperation(double num1, double num2, char op) {
        switch (op) { // Switch statement to check the operator
            case '+':
                return num1 + num2; // Perform addition
            case '-':
                return num1 - num2; // Perform subtraction
            case '/':
                if (num2 != 0) { // Check if denominator is not zero
                    return num1 / num2; // Perform division
                } else {
                    System.out.println("Error! " + num1 + " cannot be divided by zero."); // Error message
                    return Double.NaN; // Return "Not a Number" for invalid division
                }
            case '*':
                return num1 * num2; // Perform multiplication
            default:
                System.out.println("Invalid operation!!!"); // Error message for invalid operator
                return Double.NaN;
        }
    }

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        System.out.print("Enter the first number: "); // Prompt user for first number
        double num1 = scanner.nextDouble(); // Read first number from user

        System.out.print("Enter an operator (+, -, *, /): "); // Prompt user for operator
        char op = scanner.next().charAt(0); // Read operator from user input

        System.out.print("Enter the second number: "); // Prompt user for second number
        double num2 = scanner.nextDouble(); // Read second number from user

        double result = basicOperation(num1, num2, op); // Call the method to perform calculation
        if (!Double.isNaN(result)) { // Check if result is valid
            System.out.println("Result: " + result); // Print the result
        }

        scanner.close(); // Close the scanner object to prevent resource leak
    }
}
