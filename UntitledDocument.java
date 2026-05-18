import java.util.Scanner;

public class UntitledDocument{
public static void main(String... ddd){
Scanner input = new Scanner(System.in);

int userInput = 0;
while(true){
System.out.print("""
============menu=================
1. cars
2. bus
3. ship
0. exit
""");
userInput = input.nextInt();

if (userInput == 1){
System.out.print("""
============cars=================
1. white
2. blue
3. black
""");
userInput = input.nextInt();

if (userInput == 1){
System.out.print("""
============white=================
1. big
2. small
3. medium
""");
}
}

if (userInput == 2){
System.out.print("""
============bus=================
1. white
2. blue
3. black
""");
userInput = input.nextInt();

if (userInput == 1){
System.out.print("""
============white=================
1. big
2. small
3. medium
""");
}
}
switch (userInput){
case 3:
System.out.print("""
============ship=================
1. big
2. small
3. medium
""");

userInput = input.nextInt();

switch (userInput){
case 1:
System.out.print("""
============ship=================
1. big1
2. small2
3. medium3
""");



}
}



if (userInput == 0);
 break;
}





















}
}
