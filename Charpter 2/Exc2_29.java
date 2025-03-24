public class Exc2_29 {
    public static void main(String[] args) {
        // Characters to display their integer equivalents
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        System.out.println("Character\tInteger Equivalent");

        // Loop through each character and display its integer value
        for (char character : characters) {
            System.out.printf("%c\t\t%d%n", character, (int) character);
        }
    }
}
