import java.util.Arrays;
import java.util.Scanner;
public class LargestCopy{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int grade[] = new int[5];
        int largest = 0;

        for(int i = 0; i < grade.length; i++){
            System.out.print("Enter a number: ");
            
            grade[i] = input.nextInt();

            largest = grade[i];
            if (grade[i] > largest){
                largest = grade[i];
            }

        }
         System.out.print(grade);
         System.out.println(largest);
    }
}
