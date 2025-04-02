package bridgelabz;
import bridgelabz.basicJunitTest.EvenOddChecker;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;

public class EvenOddTest {
    static EvenOddChecker evenOddChecker;

    @BeforeAll
    public static void initialize(){
            evenOddChecker = new EvenOddChecker();
    }

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "3, false",
            "4, true"
    })
    public void evenOddCheck(int n, boolean expected) {
        assertEquals(expected, evenOddChecker.isEven(n));
    }
}
