import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    @Test
    public void validateLengthLengthGreaterThan8True(){
        boolean actual = PasswordValidator.validateLength("Password123");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void validateLengthLengthGreaterThan8False(){
        boolean actual = PasswordValidator.validateLength("Passwo");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void validateLengthExactly8True(){
        boolean actual = PasswordValidator.validateLength("Daniel88");
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
