package bridgelabz.basicProblemstest;

import bridgelabz.basicJunitTest.DatabaseConnection;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
    DatabaseConnection d;

    @BeforeEach
    public void initialize(){
        d = new DatabaseConnection("MySql");
    }

    @AfterEach
    public void disconnectTest(){
        d.disconnect();
    }

    @Test
    public void connectionTest(){
        d.connect();
    }
}
//Connecting to the database server MySql
//Disconnecting from the database server