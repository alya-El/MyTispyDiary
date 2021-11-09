package com.example.projectapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrationValidatorTest {
    @Test
    public void emailPass(){
        RegistrationValidator et = new RegistrationValidator();
        assertEquals(true, et.emailIsValid("wn335813@dal.ca"));
    }
    @Test
    public void emailFail(){
        RegistrationValidator et1 = new RegistrationValidator();
        assertEquals(false, et1.emailIsValid("wns66557"));
    }
    @Test
    public void passwordPass(){
        RegistrationValidator et = new RegistrationValidator();
        assertEquals(true, et.passwordIsStrong("Adam!123"));
    }
    @Test
    public void passwordFail(){
        RegistrationValidator et = new RegistrationValidator();
        assertEquals(false, et.passwordIsStrong("adam"));
    }
    @Test
    public void passwordSame(){
        RegistrationValidator et = new RegistrationValidator();
        assertTrue(et.passwordsMatch("Adam!123", "Adam!123"));
    }
    @Test
    public void passwordDifferent(){
        RegistrationValidator et = new RegistrationValidator();
        assertFalse(et.passwordsMatch("Adam!123", "Adam!124"));
    }
}
