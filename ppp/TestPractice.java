import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPractice {
    
    @Test
    public void testToCheckTheSumOfAllTheElementInAnArray(){
            int[] number = {1, 2, 3, 4, 5};
            int expectedValue = 15;
            int actualValue = Practice.sumOfArrays(number);
            assertEquals(actualValue, expectedValue);
    }
}
