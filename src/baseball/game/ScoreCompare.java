package baseball.game;

public class ScoreCompare {

    public void compare(int strike, int ball) {
        compareBothNoCount(strike, ball);
        compareEitherOneCount(strike, ball);
        compareBothHaveScore(strike, ball);
    }

    private void compareBothNoCount(int strike, int ball) {
        if (strike == UserNumber.DEFAULT && ball == UserNumber.DEFAULT) {
            Output.printZeroScore();
        }
    }

    private void compareEitherOneCount(int strike, int ball) {
        if (strike > UserNumber.DEFAULT && ball == UserNumber.DEFAULT) {
            Output.printStrikeScore(strike);

        } else if (strike == UserNumber.DEFAULT && ball > UserNumber.DEFAULT) {
            Output.printBallScore(ball);
        }
    }

    private void compareBothHaveScore(int strike, int ball) {
        if (strike > UserNumber.DEFAULT && ball > UserNumber.DEFAULT) {
            Output.printTotalScore(strike, ball);
        }
    }

}
