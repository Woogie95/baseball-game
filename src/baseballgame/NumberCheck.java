package baseballgame;

import java.util.List;

import static baseballgame.CenterProcess.MAX_VALUE;
import static baseballgame.UserNumber.DEFAULT;

public class NumberCheck {

    private int strike;
    private int ball;

    public NumberCheck() {
        this.strike = DEFAULT;
        this.ball = DEFAULT;
    }

    public void compareNumber(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int i = DEFAULT; i < MAX_VALUE; i++) {
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
