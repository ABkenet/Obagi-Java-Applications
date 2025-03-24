public class Exc2_31 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        // Loop through numbers from 0 to 10
        for (int number = 0; number <= 10; number++) {
            System.out.printf("%d\t%d\t%d%n", 
                              number, 
                              number * number,      // Square
                              number * number * number); // Cube
        }
    }
}
