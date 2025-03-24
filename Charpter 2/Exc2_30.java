import java.util.Scanner;

public class Exc2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        // Extract and print each digit separated by three spaces
        System.out.printf("%d   %d   %d   %d   %d%n",
                (number / 10000),       // First digit
                (number / 1000) % 10,  // Second digit
                (number / 100) % 10,   // Third digit
                (number / 10) % 10,    // Fourth digit
                number % 10);          // Fifth digit

        input.close();
    }
}
