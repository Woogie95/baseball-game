package baseballgame;

import java.util.List;

public class NumberCheck {

    private int strike;
    private int ball;

    public NumberCheck() {
        this.strike = 0;
        this.ball = 0;
    }

    public void numberCompare(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int i = 0; i < 3; i++) {
            if (computerNumber.contains(userNumber.get(i))) {
                if (computerNumber.get(i).equals(userNumber.get(i))) {
                    strike++;
                } else {
                    ball++;
                }
            }
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
