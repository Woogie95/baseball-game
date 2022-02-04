package baseball.game;

import java.util.List;

public class CenterProcess {

    public static final int MAX_VALUE = 3;
    private final static String CONTINUE_DECISION_NUMBER = "1";

    private boolean replay = true;
    private boolean newGame = true;

    public static Input input = new Input();

    public void repeatBaseballGame() {
        ComputerRandomNumber computerRandomNumber = new ComputerRandomNumber();
        while (replay) {
            newGame = true;
            List<Integer> computerNumber = computerRandomNumber.makeComputerNumber();
            UserNumber userNumber = new UserNumber();
            while (newGame) {
                inputNumberNotice();
                NumberCheck numberCheck = new NumberCheck();
                numberCheck.compareNumber(computerNumber, userNumber.makeUserNumber());
                deliverCompareValue(numberCheck.getStrike(), numberCheck.getBall());
                restartCheck(numberCheck.getStrike());
            }
        }
    }

    private void inputNumberNotice() {
        Output.inputNumberMessage();
    }


    private void deliverCompareValue(int strike, int ball) {
        ScoreCompare scoreCompare = new ScoreCompare();
        scoreCompare.compare(strike, ball);

    }

    private void restartCheck(int strike) {
        if (strike == MAX_VALUE) {
            Output.printGameOverMessage();
            newGame = false;
            replay = inputRestartCheck();
        }
    }

    private boolean inputRestartCheck() {
        return input.inputNumber().equals(CONTINUE_DECISION_NUMBER);
    }

}
