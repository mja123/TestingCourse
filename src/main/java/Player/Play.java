package Player;

public class Play {
    private int minNumberToWin;

    public Play(int minNumberToWin) {
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play(Dice dice) {
        return dice.roll() > minNumberToWin;
    }

}
