import java.util.Scanner;

public class Exc2_3 {
    public static void main(String[] args) {
        // a) Declare variables
        int c, thisIsAVariable, q76354, number;

        // b) Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // c) Input an integer and assign to variable 'value'
        Scanner input = new Scanner(System.in);
        int value = input.nextInt(); // Reading the input from user

        // d) Print "This is a Java program" on one line
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines using System.out.printf
        System.out.printf("This is a Java%nprogram%n");

        // f) Check if the variable 'number' is not equal to 7
        number = value; // Example assignment, using 'value' as input for demonstration
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        input.close(); // Close the Scanner object
    }
}
