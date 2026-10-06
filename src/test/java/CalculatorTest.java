import org.example.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(calculator.add(4, 6), 10);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(calculator.subtract(6, 4), 2);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(calculator.multiply(4, 6), 24);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertEquals(calculator.divide(10, 5), 2);
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }
}
