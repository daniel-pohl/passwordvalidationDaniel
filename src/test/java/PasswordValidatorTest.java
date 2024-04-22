import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    @Test
    public void validateLengthWhenLengthGreaterThan8True(){
        boolean actual = PasswordValidator.validateLength("Password123");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void validateLengthWhenLengthGreaterThan8False(){
        boolean actual = PasswordValidator.validateLength("Passwo");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void validateLengthWhenExactly8True(){
        boolean actual = PasswordValidator.validateLength("Daniel88");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void containsDigitsWhenTrue() {
        boolean actual = PasswordValidator.containsDigits("Password123");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void containsDigitsWhenFalse() {
        boolean actual = PasswordValidator.containsDigits("PasswordPassword");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void containsDigitsWhenTrueAgain() {
        boolean actual = PasswordValidator.containsDigits("DanielPassword4");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void containsUpperCaseAndLowerCaseWhenInputStringOutputTrue() {
        boolean actual = PasswordValidator.containsUpperCaseAndLowerCase("DanielPassword4");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void containsUpperCaseAndLowerCaseWhenInputStringOutputFalse() {
        boolean actual = PasswordValidator.containsUpperCaseAndLowerCase("daniel");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void IsCommonPasswordWhenInputStringOutputTrue() throws IOException {
        boolean actual = PasswordValidator.isCommonPassword("12345");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void IsCommonPasswordWhenInputStringOutputFalse() throws IOException {
        boolean actual = PasswordValidator.isCommonPassword("Dirkules1234");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void containsSpecialCharacterWhenInputStringOutputFalse() throws IOException {
        boolean actual = PasswordValidator.containsSpecialCharacter("!Dirkules?1234");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void containsSpecialCharacterWhenInputStringOutputTrue() throws IOException {
        boolean actual = PasswordValidator.containsSpecialCharacter("Dirkules1234");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
