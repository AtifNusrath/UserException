package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean isValidateFirstName(String firstName) throws UserRegistrationException {
        if (!validateRegex(firstName, RegexConstant.FIRST_NAME_REGEX))
            throw new UserRegistrationException("Invalid First name");
        return true;
    }
    private boolean validateRegex(String request, String pattern) {
        return Pattern.compile(pattern).matcher(request).matches() ? true : false;
    }
}
