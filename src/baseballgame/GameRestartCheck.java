package baseballgame;

public class GameRestartCheck {

    private final static int CONTINUE_DECISION_NUMBER = 1;

    public boolean restartCheck() {
        Input input = new Input();
        return input.inputNumber() == CONTINUE_DECISION_NUMBER;
    }

}

