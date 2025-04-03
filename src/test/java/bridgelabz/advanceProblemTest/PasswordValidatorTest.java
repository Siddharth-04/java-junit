package bridgelabz.advanceProblemTest;

import bridgelabz.advanceJunitTest.PasswordValidator;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @ParameterizedTest
    @ValueSource(
        strings={"Siddharth1","ABc@129password"}
    )
    public void shouldValidatePassword(String password){
        assertTrue(passwordValidator.validatePassword(password));
    }
}
