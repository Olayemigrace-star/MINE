//Mirror right angle triangle 

import java.util.Scanner;

public class doc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int totalRows = input.nextInt();

        for (int currentRow = 1; currentRow <= totalRows; currentRow++) {
;
            for (int spaceCount = 1; spaceCount <= totalRows - currentRow; spaceCount++) System.out.print(" ");

            for (int starCount = 1; starCount <= currentRow; starCount++) System.out.print("*");

            System.out.println();
        }
    }9
}
