public class Calculator {
    public static int palindrome(int num){
        int eachDigit = 0;
        int copy = num;
        int reverse = 0;
        while (num > 0){
        
            eachDigit = num % 10;
            reverse = (reverse * 10) + eachDigit;
            num /= 10;   
        }
        
        if (copy == reverse){
            return reverse;
        }else{
            return 0;        
        } 

 
        
    }
}
