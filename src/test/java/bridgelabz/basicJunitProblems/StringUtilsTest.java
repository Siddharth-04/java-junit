package bridgelabz.basicJunitProblems;

import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class StringUtilsTest {
     static StringUtils stringTest;

    @BeforeAll
    public static void initString(){
        stringTest = new StringUtils("racecar");
        System.out.println(stringTest.s);
    }

    @Test
    public void reverseTest(){
        assertEquals("racecar",stringTest.reverse());
    }

    @Test
    public void isPalindrome(){
        assertEquals(true,stringTest.isPalindrome());
    }

    @Test
    public void convertUpperCase(){
        assertEquals("RACECAR",stringTest.toUpperCase());
    }
}
//racecar