import java.util.Scanner;

public class Exc2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if odd or even
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        input.close();
    }
}
