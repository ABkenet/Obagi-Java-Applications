public class Operators{
    public static void main(String[] args){
        //Assignment Operator (=)

        int num1,num2;

        num1 = 19;
        num2 = 5;

        //Arighmetic Operator (+,*,_,/,%)

        int sum = num1 + num2;

        int product = num1 * num2;

        int difference = num1 - num2;

        double quotient = (double)num1/num2;

        int modulus = num1%num2;

        //Relational Operators(>,<,>=,<=,==,!=)

        boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanOrEqualTo = num1 >= num2;


        System.out.printf("The sun of the number is: %d%n",sum);
        System.out.printf("The product of the numbers: %d%n",product);
        System.out.printf("The difference between %d and %d is %d%n",num2,num1,difference);
        System.out.printf("The quotient of num1 and num2 is %f%n",quotient);
        System.out.printf("The modulus of num1 and num 2 is %d%n",modulus);
        System.out.println("==========================================================================================");

        System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num2,num2,isGreaterThanOrEqualTo);
	}
}	
		