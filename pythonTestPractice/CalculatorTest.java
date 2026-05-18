import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testToCheckIfANumberIsAPalindrome(){
        int num = 121;
        int result = Calculator.palindrome(num);
        int expected = 121;
        assertEquals(expected, result);
    }
}
