import java.util.Scanner;

public class Exc2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Read five integers
        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > largest) largest = number;
            if (number < smallest) smallest = number;
        }

        // Print results
        System.out.printf("Largest: %d%n", largest);
        System.out.printf("Smallest: %d%n", smallest);

        input.close();
    }
}
