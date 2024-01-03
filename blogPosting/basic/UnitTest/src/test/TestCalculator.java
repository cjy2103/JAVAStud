import main.Calculator;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class TestCalculator {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
        assertEquals(0, calculator.add(3,-3));
        assertEquals(-2, calculator.add(-1,-1));
        assertEquals(14, calculator.add(7,7));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-2, calculator.subtract(-1, 1));
        assertEquals(0, calculator.subtract(-1, -1));
    }
}
