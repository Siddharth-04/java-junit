package bridgelabz.advanceJunitProblems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {
    static UserRegistration user;

    @ParameterizedTest
    @CsvSource({
            "Siddharth,siddharth@gmail.com,passWord1",
            "Ishaan,ishaan@gmail.com,passWord2",
            "Dhruv,dhruv@gmail.com,passWord3"
    })
    public void shouldRegsiterUser(String name,String email ,String password) {
        user = new UserRegistration(name,email,password);
        assertTrue(user.registerUser());
    }
}
