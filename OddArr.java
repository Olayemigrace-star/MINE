import java.util.Arrays;
 
 public class OddArr{
 
 public static void main(String[] args){
 
 int[] array = {2, 4, 7, 9, 5};
 int[] odd = new int[2];
 int j = 0;
  
 for (int number = 1 ; number < array.length; number += 2){
  odd[j] = array[number];
  j++;
 
 }
 
  System.out.print(Arrays.toString(odd));
 
 
 
 
 
 }
 }
