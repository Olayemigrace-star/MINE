import java.util.Scanner;
 
 public class Reverse{
 
 public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter your digits: ");
 int integer = input.nextInt();
 int digit = 1;
 for (;integer > 0; integer /= 10){
 
 digit = integer % 10;
 

 System.out.print(digit);
 }
 
  
 //pSystem.out.println();
 
 
 }
 
 
 
 }
