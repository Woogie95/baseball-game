package baseball.game;

public class ScoreCompare {

    public void compare(int strike, int ball) {
        compareZeroPoint(strike, ball);
        compareStrikeCount(strike, ball);
        compareBallCount(strike, ball);
    }

    private void compareZeroPoint(int strike, int ball) { // 비교한다 0점
        if (strike == UserNumber.DEFAULT && ball == UserNumber.DEFAULT) {
            Output.printZeroScore();
        }
    }

    private void compareStrikeCount(int strike, int ball) { // 비교한다 스트라이크 개수
        if (strike > UserNumber.DEFAULT && ball == UserNumber.DEFAULT) {
            Output.printStrikeScore(strike);

        } else if (strike == UserNumber.DEFAULT && ball > UserNumber.DEFAULT) {
            Output.printBallScore(ball);
        }
    }

    private void compareBallCount(int strike, int ball) { // 비교한다 볼 개수
        if (strike > UserNumber.DEFAULT && ball > UserNumber.DEFAULT) {
            Output.printTotalScore(strike, ball);
        }
    }

}
