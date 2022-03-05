package PlatziPractice;

import org.junit.Test;

import org.junit.Assert;
import static PlatziPractice.Example.passwordValues.*;

public class ExampleTest {

    @Test
    public void passwordValidatorWeak() {

        Assert.assertEquals(WEAK, Example.passwordValidator("12345"));
    }

}