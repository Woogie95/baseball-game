package baseballgame;

import static baseballgame.UserNumber.DEFAULT;

public class ScoreCompare {

    public void compare(int strike, int ball, Output output) {
        compareZeroPoint(strike, ball, output);
        compareStrikeCount(strike, ball, output);
        compareBallCount(strike, ball, output);
    }

    public void compareZeroPoint(int strike, int ball, Output output) { // 비교한다 0점
        if (strike == DEFAULT && ball == DEFAULT) {
            output.printZeroScore();
        }
    }

    public void compareStrikeCount(int strike, int ball, Output output) { // 비교한다 스트라이크 개수
        if (strike > DEFAULT && ball == DEFAULT) {
            output.printStrikeScore(strike);

        } else if (strike == DEFAULT && ball > DEFAULT) {
            output.printBallScore(ball);
        }
    }

    public void compareBallCount(int strike, int ball, Output output) { // 비교한다 볼 개수
        if (strike > DEFAULT && ball > DEFAULT) {
            output.printTotalScore(strike, ball);
        }
    }

}
