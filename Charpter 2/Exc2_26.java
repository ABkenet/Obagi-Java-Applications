import java.util.Scanner;

public class Exc2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Check if the first is a multiple of the second
        if (num1 % num2 == 0) {
            System.out.printf("%d is a multiple of %d%n", num1, num2);
        } else {
            System.out.printf("%d is not a multiple of %d%n", num1, num2);
        }

        input.close();
    }
}
