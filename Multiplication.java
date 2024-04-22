import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform multiplication
        int result = num1 * num2;

        // Print the result
        System.out.println("Result of multiplication: " + result);

        // Close the scanner
        scanner.close();
    }
}
