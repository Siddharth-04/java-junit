package bridgelabz.advanceJunitProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String username;
    String email;
    String password;

    public UserRegistration(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean registerUser() {
        String regexForUsername = "^[A-Za-z]{3,}$";
        String regexForEmail = "^[a-zA-Z0-9][\\w.]{0,}@[a-z]{1,}[.][a-z]{2,3}$";
        String regexForPassword = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9!@#$%&]{8,}$";

        boolean name = this.username.matches(regexForUsername);
        boolean email = this.email.matches(regexForEmail);
        boolean password = this.password.matches(regexForPassword);

        return name && email && password;
    }
}
