package basicJava;
import java.util.Scanner;
public class TereNaam {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the integer input from the user
        int userInput = scanner.nextInt();

        // Print the entered integer
        System.out.println("You entered: " + userInput);

        // Close the scanner
        scanner.close();
}
}

