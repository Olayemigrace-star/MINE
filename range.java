public class range{
    
   public static int highest(int [] number){
   int largest = [0];
   int smallet = [0];
   
   for(int i = 1; i < number.length; i++){
       if number[i] > largest{
       largest = number[i];
       }
       if number[i] < smallet{
       smallet = number[i];
       }
       
       }
       int range = largest-smallet
        
  return range;
  }
          public static void main(String... highest){
        int [] number = {2,3,7,9,20};
        System.out.println(highest(number));
    }
   
}
