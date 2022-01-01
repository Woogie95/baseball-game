package baseballgame1;

import java.util.List;

public class NumberCheck {

    public int strike;
    public int ball;

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
