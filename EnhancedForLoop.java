public class EnhancedForLoop{
    public static void main (String[] args){
        int[] numbers ={9,3,5,4,3};
		
		String names = {"John","Precious","Nelly","Patience"}

        System.out.println("This is the traditional for loop");
        for (int i = 1; i < 5; i++){
            System.out.printf("%d%n",numbers[i]);
        }

        System.out.println("======================================================================================");
        for(int num : numbers){
            System.out.printf("%d%n",num);
        }
    }
}