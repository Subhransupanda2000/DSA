import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calcullator calcullator = new Calcullator();
        int result = calcullator.add(5, 3);
        int expectedResult = 8;
        assertEquals(expectedResult, result);
    }
}
