package com.bridgelabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationExceptionTest {
    private UserRegistration user;

    @Before
    public void UserRegistrationObj() {
        user = new UserRegistration();
    }

    @Test
    public void testFirstName_thenAssertionSucceeds() {
        try {
            Assert.assertTrue(user.isValidateFirstName("Mohammed"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFirstName_thenAssertionFail() {
        try {
            Assert.assertTrue(user.isValidateFirstName("firstname"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testLastName_thenAssertionSucceeds() {
        try {
            Assert.assertTrue(user.isValidateLastName("Atif"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testLastName_thenAssertionFail() {
        try {
            Assert.assertTrue(user.isValidateLastName("lastname"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testEmail_thenAssertionSucceeds() {
        try {
            Assert.assertTrue(user.isValidateEmail("abc@gmail.com"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testEmail_thenAssertionFail() {
        try {
            Assert.assertTrue(user.isValidateEmail("abc@gmail@.com@"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

}
