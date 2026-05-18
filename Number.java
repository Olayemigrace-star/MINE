import java.util.Scanner;

public class Number{

  public static void main(String[] agrs)
 {
     Scanner input = new Scanner(System.in);

 System.out.print("Enter your first number ");
 int firstNumber = input.nextInt();

System.out.print("Enter the second number ");
 int secondNumber = input.nextInt();

   int product = firstNumber*secondNumber;

    System.out.printf("The product is %d%n", product);


  if (firstNumber > secondNumber)

System.out.print(firstNumber);
else
System.out.print(secondNumber);


}
}
