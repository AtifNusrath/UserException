package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean isValidateFirstName(String firstName) throws UserRegistrationException {
        if (!validateRegex(firstName, RegexConstant.FIRST_NAME_REGEX))
            throw new UserRegistrationException("Invalid First name");
        return true;
    }

    public boolean isValidateLastName(String lastName) throws UserRegistrationException {
        if (!validateRegex(lastName, RegexConstant.LAST_NAME_REGEX))
            throw new UserRegistrationException("Invalid Last name");
        return true;
    }

    public boolean isValidateEmail(String email) throws UserRegistrationException {
        if (!validateRegex(email, RegexConstant.EMAIL_ID_REGEX))
            throw new UserRegistrationException("Invalid Email Id");
        return true;
    }

    public boolean isValidateMobileNumber(String mobileNumber) throws UserRegistrationException {
        if (!validateRegex(mobileNumber, RegexConstant.MOBILE_NUMBER_REGEX)) {
            return false;
        }
        return true;
    }

    public boolean isValidatePassword(String password) throws UserRegistrationException {
        if (!validateRegex(password, RegexConstant.PASSWORD_REGEX))
            throw new UserRegistrationException("Invalid Password");
        return true;
    }

    private boolean validateRegex(String request, String pattern) {
        return Pattern.compile(pattern).matcher(request).matches() ? true : false;
    }
}
