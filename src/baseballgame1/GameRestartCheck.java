package baseballgame1;

public class GameRestartCheck {

    public final static int MAX_VALUE = 3;
    public final static int CONTINUE_DECISION_NUMBER = 1;
    public int strike = UserNumberGenerator.strike;

    public void restartCheck(int strike) {
        GameRestart gameRestart = new GameRestart();

        if (strike == MAX_VALUE) {
            Output.gameOverMessage();
            if (Input.inputNumber() != CONTINUE_DECISION_NUMBER) {
                gameRestart.baseballFinish();
            } else {
                ComputerNumberGenerator.temporaryNumber.clear();
                CenterProcess.computerRandomNumber.clear();
            }
            gameRestart.randomNumberBreak();
        }
    }
}

