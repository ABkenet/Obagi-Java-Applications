import java.util.Scanner;

public class Exc2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Compare integers
        if (num1 > num2) {
            System.out.printf("%d is larger%n", num1);
        } else if (num2 > num1) {
            System.out.printf("%d is larger%n", num2);
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}
