import org.example.calculated.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatedTests {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("1 + 2");
        assertEquals(3, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10 - 2");
        assertEquals(8, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10 * 2");
        assertEquals(20, result, 0.0001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10 / 2");
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testDivisionZero() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10 / 0");
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testSuntacsis1() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10/0");
        assertEquals(5, result, 0.0001);
    }
    @Test
    public void testSuntacsis2() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10 /0");
        assertEquals(5, result, 0.0001);
    }
    @Test
    public void testSuntacsis3() {
        Calculator calculator = new Calculator();
        double result = calculator.operationNumber("10/ 0");
        assertEquals(5, result, 0.0001);
    }
}
