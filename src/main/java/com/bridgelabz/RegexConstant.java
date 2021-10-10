package com.bridgelabz;

public class RegexConstant {
    private RegexConstant() {
    }

    public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{3,}";
    public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{3,}";
    public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

}
