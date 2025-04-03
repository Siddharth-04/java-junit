package bridgelabz.advanceProblemTest;
import bridgelabz.advanceJunitTest.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class BankAccountTest {
    static BankAccount bankAccount;
    final double DELTA = 0.000;

    @BeforeAll
    public static void initialize(){
        bankAccount = new BankAccount(10000.0);
    }

    @Test
    public void testGetBalance(){
        assertEquals(9500,bankAccount.getBalance(),DELTA);
    }

    @Test
    public void testWithdraw(){
        assertEquals(9500,bankAccount.withdraw(500),DELTA);
    }

    @Test
    public void testDeposit(){
        assertEquals(10000,bankAccount.deposit(500),DELTA);
    }
}
