package baseball.game;

public class GameRestartCheck {

    private final static String CONTINUE_DECISION_NUMBER = "1";

    public boolean restartCheck() {
        Input input = new Input();
        return input.inputNumber().equals(CONTINUE_DECISION_NUMBER);
    }

}

