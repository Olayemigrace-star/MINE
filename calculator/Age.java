public class Age{

public static void main(String[] args){
System.out.print(identity(18));
}

public static String identity (int age){
if (age < 18) return ("Your are a child. ");

if (age > 18) return ("Your are an Adult. ");
else return ("You just turned 18. ");


}

}
