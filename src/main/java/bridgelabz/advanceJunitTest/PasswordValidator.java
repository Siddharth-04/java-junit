package bridgelabz.advanceJunitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean validatePassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])[A-Za-z0-9#@!$%&._?/]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()){
            return true;
        }

        return false;
    }
}
