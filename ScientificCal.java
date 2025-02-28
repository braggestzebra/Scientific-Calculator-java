import java.util.Scanner;
import java.lang.Math;

public class ScientificCal { // Define the class ScientificCalculator

    public static double basicOperation(double a, double b, char op) { // Define a method for basic operations
        switch (op) { // Switch statement to handle different operators
            case '+': // Case for addition
                return a + b; // Return the sum of a and b
            case '-': // Case for subtraction
                return a - b; // Return the difference of a and b
            case '*': // Case for multiplication
                return a * b; // Return the product of a and b
            case '/': // Case for division
                if (b != 0) { // Check if the divisor is not zero
                    return a / b; // Return the quotient of a and b
                } else { // If the divisor is zero
                    System.out.println("Error!!!!!" + a + "/" + b + " is undefined"); // Print error message
                    return Double.NaN; // Return NaN (Not a Number)
                }
            default: // Default case for invalid operator
                System.out.println("Error!!!!!" + op + " is not a valid operator"); // Print error message
                return Double.NaN; // Return NaN
        }
    }

    public static double scientificOperation(double a, String op) { // Define a method for scientific operations
        switch (op) { // Switch statement to handle different scientific operations
            case "sin": // Case for sine
                return Math.sin(a); // Return the sine of a
            case "cos": // Case for cosine
                return Math.cos(a); // Return the cosine of a
            case "tan": // Case for tangent
                return Math.tan(a); // Return the tangent of a
            case "sec": // Case for secant
                return 1 / Math.cos(a); // Return the secant of a
            case "cosec": // Case for cosecant
                return 1 / Math.sin(a); // Return the cosecant of a
            case "cot": // Case for cotangent
                return 1 / Math.tan(a); // Return the cotangent of a
            case "log": // Case for natural logarithm
                return Math.log(a); // Return the natural logarithm of a
            case "square": // Case for square
                return Math.pow(a, 2); // Return the square of a
            case "cube": // Case for cube
                return Math.pow(a, 3); // Return the cube of a
            case "sqrt": // Case for square root
                return Math.sqrt(a); // Return the square root of a
            case "exp": // Case for exponential
                return Math.exp(a); // Return the exponential of a
            default: // Default case for invalid operator
                System.out.println("Error!!!!! " + op + " is not a valid operator"); // Print error message
                return Double.NaN; // Return NaN
        }
    }

    public static double fact(double a) { // Define a method for factorial
        if (a < 0) { // Check if the number is negative
            System.out.println("Error!!!!! Factorial of negative number is undefined"); // Print error message
            return Double.NaN; // Return NaN
        } else if (a == 0) { // Check if the number is zero
            return 1; // Return 1 as factorial of 0 is 1
        } else { // For positive numbers
            return a * fact(a - 1); // Return the factorial of a using recursion
        }
    }

    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Select operation type: 1 for Basic, 2 for Scientific, 3 for Factorial"); // Prompt user for
                                                                                                     // operation type
        int choice = sc.nextInt(); // Read the user's choice

        switch (choice) { // Switch statement to handle different choices
            case 1: // Case for basic operation
                System.out.println("Enter the first number: "); // Prompt user for first number
                double a = sc.nextDouble(); // Read the first number
                System.out.println("Enter the second number: "); // Prompt user for second number
                double b = sc.nextDouble(); // Read the second number
                System.out.println("Enter the operator (+, -, *, /): "); // Prompt user for operator
                char op = sc.next().charAt(0); // Read the operator
                System.out.println("Result of basic operation: " + basicOperation(a, b, op)); // Print the result of
                                                                                              // basic operation
                break; // Break out of the switch statement
            case 2: // Case for scientific operation
                System.out.println("Enter the number: "); // Prompt user for the number
                double c = sc.nextDouble(); // Read the number
                System.out.println(
                        "Enter the scientific operator (sin, cos, tan, sec, cosec, cot, log, square, cube, sqrt, exp): "); // Prompt user for scientific operator                                                                                                                         // user
                                    String sop = sc.next(); // Read the scientific operator
                System.out.println("Result of scientific operation: " + scientificOperation(c, sop)); // Print the result of scientific operation
                     break; // Break out of the switch statement
            case 3: // Case for factorial
                System.out.println("Enter the number: "); // Prompt user for the number
                double d = sc.nextDouble(); // Read the number
                System.out.println("Factorial of " + d + " is: " + fact(d)); // Print the factorial of the number
                break; // Break out of the switch statement
            default: // Default case for invalid choice
                System.out.println("Invalid choice"); // Print error message
        }
    }
}
//Simpler version that does all the operation
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number: ");
// double a = sc.nextDouble();
// System.out.println("Enter the second number: ");
// double b = sc.nextDouble();
// System.out.println("Enter the operator: ");
// char op = sc.next().charAt(0);
// System.out.println("Enter the scientific operator: ");
// String sop = sc.next();
// System.out.println("Result of basic operation: " + basicOperation(a, b, op));
// System.out.println("Result of scientific operation: " +
// scientificOperation(a, sop));
// System.out.println("Factorial of " + a + " is: " + fact(a));
// }
