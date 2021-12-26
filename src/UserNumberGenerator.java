import java.util.ArrayList;
import java.util.List;

public class UserNumberGenerator {

    public static int strike = 0;
    public static int ball = 0;

    public static List<Integer> userNumber = new ArrayList<>();

    public static void userNumberCreator(int input, List<Integer> computerRandomNumber) {
        for (int i = 0; i < 3; i++) {
            userNumber.add(input);
            if (computerRandomNumber.contains(userNumber.get(i))) {
                if (computerRandomNumber.get(i).equals(userNumber.get(i))) {
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
