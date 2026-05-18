import java.util.Scanner;
 
 public class Reverse{
 
 public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter the integers: ");
 int integer = input.nextInt();
 int value = 1;
int sum =0;
for(int number = integer; integer > 0; integer /= 10){

value = integer % 10;
sum += value;
System.out.print(sum + " ");
}




}

}
