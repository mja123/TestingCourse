package Utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsStringTest {

    private String word = "";

    @Test
    public void stringEmpty() {
        boolean result = UtilsString.isEmpty(word);

        assertFalse(result);
    }
    @Test
    public void stringWithChars() {
        word = "hi asdfa";

        boolean result = UtilsString.isEmpty(word);

        assertTrue(result);
    }
    @Test
    public void stringWithOneSpace() {
        word = " ";

        boolean result = UtilsString.isEmpty(word);

        assertFalse(result);
    }
}