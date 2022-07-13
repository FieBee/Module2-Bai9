import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName("Testing add 0")
    void testFindAbsolute0(){
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing add 100")
    void testFindAbsolute100(){
        int number = -100;
        int expected = 100;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }


}
