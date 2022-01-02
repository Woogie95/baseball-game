package baseballgame1;

public class GameRestartCheck {

    public final static int CONTINUE_DECISION_NUMBER = 1;

    public boolean restartCheck() {
            return Input.inputNumber() == CONTINUE_DECISION_NUMBER;
    }

}

