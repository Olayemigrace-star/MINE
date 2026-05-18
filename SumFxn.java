public class SumFxn{

public static void main(String[] args){

System.out.print(sumDigits(5672));
}

public static int sumDigits(int n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
 


}
