import org.junit.jupiter.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void testThatArrayIsReversing(){
        int[] number = {12, 234, 35768, 465, 534};
        int[] expectedValue = {534, 465, 35768, 234, 12};
        int actualValue = Array.reverse(number);
        assertEquals(actualValue, expectedValue);
        
    }    
}
