import java.util.Scanner;

public class Student{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String userInput = input.nextLine();

        System.out.println("What is your age?");
         int userAge = input.nextInt();

        System.out.printf("Hello %s, You are %d years old\n", userInput, userAge);
    }
}

