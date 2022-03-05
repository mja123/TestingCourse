package Utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterValidatorTest {

    String word;
    Boolean result;

    @Test
    public void onlyNumbersOK() {
        word = "12345";

        result = CharacterValidator.onlyNumbers(word);

        assertTrue(result);
    }
    @Test
    public void onlyNumbersWRONG() {
        word = "asdfsad";

        result = CharacterValidator.onlyNumbers(word);

        assertFalse(result);
    }
    @Test
    public void onlyNumbersEMPTY() {
        word = "";

        result = CharacterValidator.onlyNumbers(word);

        assertFalse(result);
    }

}