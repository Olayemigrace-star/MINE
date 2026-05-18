import java.util.Scanner;
 
 public class palindrome{
 
 public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 System.out.print("Enter your digits: ");
 int integer = input.nextInt();
 
 int actualNumber = integer;
 int reversedNumber = 0;
 for (int number = integer; integer > 0; integer /= 10){
 
 int digit = integer % 10;
 reversedNumber = (reversedNumber * 10) + digit;
 }
 
 if (actualNumber == reversedNumber){
 System.out.print(reversedNumber + ": Is a Palindrome ");
 }
 else
 {
 System.out.print("It is not a Palindrome ");
 }
  
 //pSystem.out.println();
 
 
 
 }
 
 
 
 }
