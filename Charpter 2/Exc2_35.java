import java.util.Scanner;

public class Exc2_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter total miles driven per day: ");
        double milesDriven = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();

        // Calculate daily driving cost
        double gasolineCost = (milesDriven / milesPerGallon) * costPerGallon;
        double dailyDrivingCost = gasolineCost + parkingFees + tolls;

        // Display the result
        System.out.printf("Your daily driving cost is: $%.2f%n", dailyDrivingCost);

        input.close();
    }
}
