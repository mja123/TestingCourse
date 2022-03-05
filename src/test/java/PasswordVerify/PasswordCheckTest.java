package PasswordVerify;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;

/*
Required:
    Between 6 and 10 characters long
    ▪ Contain at least one digit
    ▪ Contain at least one upper case letter
*/

public class PasswordCheckTest {
    @Test
    public void passwordLength() {

        assertThat("Expected false, 5 chars",
                PasswordCheck.securePasswordLength("12345"), is(false));
        assertThat("Expected true, 6 chars",
                PasswordCheck.securePasswordLength("123456"), is(true));
        assertThat("Expected true, 9 chars",
                PasswordCheck.securePasswordLength("hellooooo"), is(true));
        assertThat("Expected true, 10 chars",
                PasswordCheck.securePasswordLength("hoSl234**3"), is(true));
        assertThat("Expected false, 11 chars",
                PasswordCheck.securePasswordLength("12345asD*s2"), is(false));
    }

    @Test
    public void passwordHasDigits() {

        assertThat("Expected true, password has one digit",
                PasswordCheck.securePasswordDigits("hellooo1"), is(true));
        assertThat("Expected true, all password are digits",
                PasswordCheck.securePasswordDigits("12345678"), is(true));
        assertThat("Expected false, password doesn't have digits",
                PasswordCheck.securePasswordDigits("hi you!!"), is(false));
    }

    @Test
    public void passwordHasUpperCase() {

        assertThat("Expected true, password has one letter in uppercase ",
                PasswordCheck.securePasswordUpperCase("Helloo23"), is(true));
        assertThat("Expected true, password has all the letters in uppercase",
                PasswordCheck.securePasswordUpperCase("HELLOOO1"), is(true));
        assertThat("Expected false, password doesn't have any letter in uppercase",
                PasswordCheck.securePasswordUpperCase("123456asd"), is(false));
        assertThat("Expected false, password doesn't have any letter",
                PasswordCheck.securePasswordUpperCase("1234567"), is(false));
    }

    @Test
    public void passwordSecurity() {
        assertThat("Expected true, password has at least one upper case letter, one digit and is in the range of chars.",
                PasswordCheck.securePassword("Helloo23"), is(true));
        assertThat("Expected false, password doesn't keep all the requires",
                PasswordCheck.securePassword("helloo123"), is(false));
    }

}