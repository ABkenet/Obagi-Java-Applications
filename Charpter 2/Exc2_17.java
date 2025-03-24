import java.util.Scanner;

public class Exc2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Calculate sum, average, and product
        int sum = num1 + num2 + num3;
        int average = sum / 3; // Integer division
        int product = num1 * num2 * num3;

        // Determine smallest and largest
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        input.close();
    }
}
