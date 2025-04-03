package bridgelabz.basicProblemstest;

import bridgelabz.basicJunitTest.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator calc = new Calculator(20,10);

    @Test
    public void testAddition() {
        assertEquals(30,calc.add(calc.a, calc.b));
    }

    @Test
    public void testSubtraction(){
        assertEquals(calc.subtract(calc.a,calc.b),10);
    }

    @Test
    public void testMultiply(){
        assertEquals(calc.multiply(calc.a,calc.b),200);
    }

    @Test
    public void testDivision(){
        assertThrows(ArithmeticException.class,() -> Calculator.divide(20,0));
    }
}
