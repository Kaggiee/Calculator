/* Import Statements */
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // Declare variables
        double number1;   // First number
        double number2;   // Second number
        String operation; // The operator used

        // Declare a Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt for first number of equation
        System.out.print("Enter the first number: ");
        number1 = keyboard.nextDouble();

        // Prompt for second number of equation
        System.out.print("Enter the second number: ");
        number2 = keyboard.nextDouble();

        // Consume newline
        keyboard.nextLine();

        // Prompt for operator
        System.out.print("Enter the operation (+, -, *, /): ");
        operation = keyboard.nextLine();

        // Switch statement to determine which operation to run
        switch (operation) {
          // Addition
          case "+":
            addition(number1, number2);
            break;
    
          // Subtraction
          case "-":
            subtraction(number1, number2);
            break;
    
          // Multiplication
          case "*":
            multiplication(number1, number2);
            break;
    
          // Division
          case "/":
            
            // Determine if the user is attempting to divide by zero and display error code
            if (number1 == 0 || number2 == 0) {
              System.out.println("Cannot divide by zero!");
              System.out.print("Result: NaN");
            }
            else {
              division(number1, number2);
              break;
            }
        }

        // Closes out keyboard
        keyboard.close();
    }
    
    public static double result;

    /**
    The addition method adds the first and second number, then prints the result.
    @param value1 The first number to be added.
    @param value2 The second number to be added.
    */

    public static void addition(double value1, double value2) {
      result = value1 + value2;
      System.out.print("Result: " + result);
    }

    /**
    The subtraction method adds the first and second number, then prints the result.
    @param value1 The first number to be subtracted.
    @param value2 The second number to be subtracted.
    */

    public static void subtraction(double value1, double value2) {
      result = value1 - value2;
      System.out.print("Result: " + result);
    }

    /**
    The multiplication method adds the first and second number, then prints the result.
    @param value1 The first number to be multiplied.
    @param value2 The second number to be multiplied.
    */

    public static void multiplication(double value1, double value2) {
      result = value1 * value2;
      System.out.print("Result: " + result);
    }

    /**
    The division method adds the first and second number, then prints the result.
    @param value1 The first number to be divided.
    @param value2 The second number to be divided.
    */

    public static void division(double value1, double value2) {
      result = value1 / value2;
      System.out.print("Result: " + result);
    }
}