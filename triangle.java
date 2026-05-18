//Upside down triangle

import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int totalRows = input.nextInt();

        for (int currentRow = totalRows; currentRow >= 1; currentRow--) {

            for (int starCount = 1; starCount <= currentRow; starCount++) System.out.print("*");
   
            System.out.println();
        }
    }
}
