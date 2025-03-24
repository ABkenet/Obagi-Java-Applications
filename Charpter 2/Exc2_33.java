import java.util.Scanner;

public class Exc2_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight and height
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display the BMI result
        System.out.printf("Your Body Mass Index (BMI) is: %.2f%n", bmi);

        // Provide BMI categories
        System.out.println("BMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal weight: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obesity: 30 or greater");

        input.close();
    }
}
