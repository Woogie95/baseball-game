package baseballgame1;

public class GameRestartCheck {

    public final static int MAX_VALUE = 3;
    public final static int CONTINUE_DECISION_NUMBER = 1;

    public CenterProcess centerProcess = new CenterProcess();

    public void restartCheck(int strike) {

        if (strike == MAX_VALUE) {
            Output.gameOverMessage();
            if (Input.inputNumber() != CONTINUE_DECISION_NUMBER) {
                centerProcess.replay = false;
            } else {
                centerProcess.clear();
            }
            centerProcess.newGame = false;
        }
    }

}

