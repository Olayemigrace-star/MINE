import java.util.Scanner;

     public class LargestNumber{

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = input.nextInt();
   
       int largest = firstNumber;
       

       System.out.println("Enter the second number");
        int secondNumber = input.nextInt();
       if 
      (secondNumber > largest ){
        largest = secondNumber;
      }

     System.out.println("Enter the third number");
        int thirdNumber = input.nextInt();
    
       if 
      (thirdNumber > largest){
      largest = thirdNumber;
     }

      System.out.println("Enter the fourth number");
        int fourthNumber = input.nextInt();
    
       if 
      (fourthNumber > largest){
      largest = fourthNumber;
      }
        

     System.out.println("Enter the fifth number");
        int fifthNumber = input.nextInt();
    
       if 
      (fifthNumber > largest){
      largest = fifthNumber;
       }

        System.out.printf("The largest number is %d%n", largest);
    }
}

