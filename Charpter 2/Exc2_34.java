import java.util.Scanner;

public class Exc2_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the current population and growth rate
        System.out.print("Enter the current world population (in billions): ");
        double currentPopulation = input.nextDouble();

        System.out.print("Enter the annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble();

        // Display the estimated population for the next five years
        System.out.println("Year\tEstimated Population (in billions)");
        for (int year = 1; year <= 5; year++) {
            currentPopulation += currentPopulation * (growthRate / 100);
            System.out.printf("%d\t%.3f%n", year, currentPopulation);
        }

        input.close();
    }
}
