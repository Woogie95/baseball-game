package baseball.game;

import java.util.List;

public class CenterProcess {

    public static final int MAX_VALUE = 3;

    private boolean replay = true;
    private boolean newGame = true;

    public void repeatBaseballGame() {
        ComputerRandomNumber computerRandomNumber = new ComputerRandomNumber();
        while (replay) {
            newGame = true;
            List<Integer> computerNumber = computerRandomNumber.makeComputerNumber();
            UserNumber userNumber = new UserNumber();
            while (newGame) {
                printNotice();
                NumberCheck numberCheck = new NumberCheck();
                numberCheck.compareNumber(computerNumber, userNumber.makeUserNumber());
                deliverCompareValue(numberCheck.getStrike(), numberCheck.getBall());
                restartCheck(numberCheck.getStrike());
            }
        }
    }

    private void printNotice() {
        Output.printNumberInputMessage();

    }

    private void deliverCompareValue(int strike, int ball) {
        ScoreCompare scoreCompare = new ScoreCompare();
        scoreCompare.compare(strike, ball);

    }

    private void restartCheck(int strike) {
        GameRestartCheck gameRestartCheck = new GameRestartCheck();
        if (strike == MAX_VALUE) {
            Output.printGameOverMessage();
            newGame = false;
            replay = gameRestartCheck.restartCheck();
        }
    }

}
