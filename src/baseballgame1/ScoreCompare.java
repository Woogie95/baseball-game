package baseballgame1;

public class ScoreCompare {

    public static final int STANDARD = 0;

    public void compare(int strike, int ball) {

        if (strike == STANDARD && ball == STANDARD) {
            Output.countNone();
        }
        if (strike > STANDARD && ball == STANDARD) {
            Output.strikeCount(strike);
        } else if (strike == STANDARD && ball > STANDARD) {
            Output.ballCount(ball);
        }
        if (strike > STANDARD && ball > STANDARD) {
            Output.countPrint(strike, ball);
        }
    }
}
