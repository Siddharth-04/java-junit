package bridgelabz;
import bridgelabz.basicJunitTest.Divide;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class DivideTest {
    static Divide divide;

    @BeforeAll
    public static void initialize() {
        divide = new Divide(10,0);
    }

    @Test
    public void testDivide(){
        assertThrows(ArithmeticException.class, () -> {divide.divide(divide.a,divide.b);});
    }
}
