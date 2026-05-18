import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    @Test
    public void TestThatIsAddingTwoNumbers(){
        int num1 = 3;
        int num2 = 6;
        int expectedAnswer = 9;
        int actualValue = Calculator.add(num1, num2);
        assertEquals(actualValue, expectedAnswer);
    }
    
    @Test
    public void TestThatNumbersAreSubtracting(){
        int num1 = 5;
        int num2 = 3;
        int expectedAnswer = 2;
        int actualValue = Calculator.minus(num1, num2);
        assertEquals(actualValue, expectedAnswer);
        
    }
    
     @Test
    public void TestThatNumbersAreMultiplying(){
        int num1 = 5;
        int num2 = 3;
        int expectedAnswer = 15;
        int actualValue = Calculator.multiply(num1, num2);
        assertEquals(actualValue, expectedAnswer);
    
    }
    
    @Test
    public void TestThatNumbersAreCanBeDivided(){
        int num1 = 6;
        int num2 = 3;
        int expectedAnswer = 2;
        int actualValue = Calculator.divide(num1, num2);
        assertEquals(actualValue, expectedAnswer);
    
    }
    
    
    
    
    
    
}
