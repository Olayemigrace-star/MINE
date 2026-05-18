import java.util.Arrays;
 
 public class EvenArr{
 
 public static void main(String[] args){
 
 int[] array = {2, 4, 7, 9, 5};
 int[] odd = new int[3];
 int j = 0;
  
 for (int number = 0; number < array.length; number += 2){
  odd[j] = array[number];
  j++;
 
 }
 
  System.out.print(Arrays.toString(odd));
 
 
 
 
 
 }
 }
