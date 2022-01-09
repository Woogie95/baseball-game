package baseballgame;

import java.util.List;

public class CenterProcess {

    public static final int MAX_VALUE = 3;

    public ComputerRandomNumber computerRandomNumber = new ComputerRandomNumber();
    private static final Output output = new Output();
    private boolean replay = true;
    private boolean newGame = true;

    public void repeatBaseball() {
        while (replay) {
            newGame = true;
            List<Integer> computerNumber = computerRandomNumber.computerNumberGenerator();
            UserNumber userNumber = new UserNumber();
            while (newGame) {
                printNotice();
                NumberCheck numberCheck = new NumberCheck();
                numberCheck.compareNumber(computerNumber, userNumber.userNumberGenerator());
                deliverCompareValue(numberCheck.getStrike(), numberCheck.getBall());
                restartCheck(numberCheck.getStrike());
            }
        }
    }

    private void printNotice() {
        output.printNumberInputMessage();

    }

    private void deliverCompareValue(int strike, int ball) {
        ScoreCompare scoreCompare = new ScoreCompare();
        scoreCompare.compare(strike, ball, new Output());

    }

    private void restartCheck(int strike) {
        GameRestartCheck gameRestartCheck = new GameRestartCheck();
        if (strike == MAX_VALUE) {
            output.printGameOverMessage();
            newGame = false;
            replay = gameRestartCheck.restartCheck();
        }
    }

}
