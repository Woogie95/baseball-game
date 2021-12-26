package baseballgame1;

public class ScoreCompare {

    public static final int STANDARD = 0;
    public int strikeCount = UserNumberGenerator.strike;
    public int ballCount = UserNumberGenerator.ball;

    public void compare(int strikeCount, int ballCount) {
        if (strikeCount == STANDARD && ballCount == STANDARD) {
            Output.countNone();
        }
        if (strikeCount > STANDARD && ballCount == STANDARD) {
            Output.strikeCount(strikeCount);
        } else if (strikeCount == STANDARD && ballCount > STANDARD) {
            Output.ballCount(ballCount);
        }
        if (strikeCount > STANDARD && ballCount > STANDARD) {
            Output.countPrint(strikeCount, ballCount);
        }
    }
}
