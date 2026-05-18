import java.util.Arrays;

public class ReverseArr{ 
public static void main(String[] args){
int[] array = {1,2,3,4,5,6,7,8,9,10};

int[] reverse = new int[array.length];
int j = 0;
for(int number = array.length - 1; number >= 0; number--){
reverse[j] = array[number];
j++;
}
System.out.print(Arrays.toString(reverse));


}
}
