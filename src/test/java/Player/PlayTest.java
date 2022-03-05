package Player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayTest {

    @Test
    public void lose() {
        Dice dice = Mockito.mock(Dice.class, Mockito.withSettings().useConstructor(2));

        Play play = new Play(4);
        //mock the result in the roll method. Always going to be 2.
        Mockito.when(dice.roll()).thenReturn(6);
        System.out.println(dice.roll());
        assertFalse(play.play(dice));
    }
    @Test
    public void win() {
        Dice dice = Mockito.mock(Dice.class);
        Play play = new Play(4);

        Mockito.when(dice.roll()).thenReturn(6);

        assertTrue(play.play(dice));
    }


}