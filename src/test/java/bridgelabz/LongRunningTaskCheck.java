package bridgelabz;
import bridgelabz.basicJunitTest.EvenOddChecker;
import bridgelabz.basicJunitTest.LongRunningTask;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class LongRunningTaskCheck {
    static LongRunningTask longRunningTask;

    @BeforeAll
    public static void initialize() {
        longRunningTask = new LongRunningTask();
    }

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    public void longRunningTasktest() {
        longRunningTask.longRunningTask();
    }
}
