import java.util.Arrays;

//public class Array {
//    
//    public static void main(String[] args){
//        
//        int[] numbers = {12, 234, 35768, 465, 534};
//        
//        int[] num = new int[5];
        
//        num[2] = 5;
        
//        System.out.println(Arrays.toString(numbers));
        
        
//        System.out.println(Arrays.toString(num));
            
//        int[] reverseArray = new int[numbers.length];
//        int reverseCount = 0;
//
//        for (int index = numbers.length - 1; index >= 0; index--){
//        
//            reverseArray[reverseCount] = numbers[index];
//            reverseCount++;
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(reverseArray));
//        
//        
//        
//    }
//}


//public class Array {
//
//public static void main(String[] args){
//
//    int[] numbers = {12, 234, 35768, 465, 534};
//    
//    reverse(numbers);
//
//
//}
//
//public static void reverse(int[] arr){
//
//        
//        int[] reverseArray = new int[arr.length];
//        int reverseCount = 0;
//
//        for (int index = arr.length - 1; index >= 0; index--){
//        
//            reverseArray[reverseCount] = arr[index];
//            reverseCount++;
//        }
//        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(reverseArray));
//        return reverseArray;
//        
//}
//
//
//
//
//
//}
//
//
public class Array {

public static void main(String[] args){

int[] number = {12, 234, 35768, 465, 534};


System.out.println(Arrays.toString(reverse(number)));

}

public static int[] reverse(int[] arr){

        
        int[] reverseArray = new int[arr.length];
        int reverseCount = 0;

        for (int index = arr.length - 1; index >= 0; index--){
        
            reverseArray[reverseCount] = arr[index];
            reverseCount++;
        }
  

 return reverseArray;
        
}


}



