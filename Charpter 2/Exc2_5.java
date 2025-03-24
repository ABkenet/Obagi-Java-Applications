//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Exc2_5 {
    public static void main(String[] args) {
        // a) State the purpose of the program
        System.out.println("This program calculates the product of three integers.");

        // b) Create a Scanner object called input
        Scanner input = new Scanner(System.in);

        // c) Declare variables x, y, z, and result
        int x, y, z, result;

        // d) Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        // e) Read the first integer and store it in x
        x = input.nextInt();

        // f) Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        // g) Read the second integer and store it in y
        y = input.nextInt();

        // h) Prompt the user to enter the third integer
        System.out.print("Enter the third integer: ");
        // i) Read the third integer and store it in z
        z = input.nextInt();

        // j) Compute the product of x, y, and z, and assign it to result
        result = x * y * z;

        // k) Display the product using System.out.printf
        System.out.printf("Product is %d%n", result);

        // Close the Scanner object
        input.close();
    }
}
