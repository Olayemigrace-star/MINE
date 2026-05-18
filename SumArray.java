//import java.util.Scanner;
public class SumArray{ 
public static void main(String[] args){
int[] array = {1,2,3,4,5,6,7,8,9,10};

int sum = 0;
for(int number = 0; number < array.length; number++){


sum += array[number];
if (array[number] % 2 == 0){
System.out.println(array[number]);
}

}
System.out.println(sum);



}
}
