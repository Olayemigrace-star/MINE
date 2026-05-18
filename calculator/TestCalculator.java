import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    
    @Test
    public void TestThatIsAddingTwoNumbers(){
        int num1 = 3;
        int num2 = 6;
        int expectedAnswer = num1 + num2;
        int actualValue = Calculator.add(num1, num2);
        assertEquals(actualValue, expectedAnswer);
    }
}
