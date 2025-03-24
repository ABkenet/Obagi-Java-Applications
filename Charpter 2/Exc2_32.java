import java.util.Scanner;

public class Exc2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0; // Counter for positive numbers
        int negatives = 0; // Counter for negative numbers
        int zeros = 0;     // Counter for zero values

        // Loop to input five numbers
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();

            if (number > 0) {
                positives++; // Increment positive counter
            } else if (number < 0) {
                negatives++; // Increment negative counter
            } else {
                zeros++;     // Increment zero counter
            }
        }

        // Display the results
        System.out.printf("Number of positive numbers: %d%n", positives);
        System.out.printf("Number of negative numbers: %d%n", negatives);
        System.out.printf("Number of zeros: %d%n", zeros);

        input.close();
    }
}
