package baseballgame;

import java.util.ArrayList;
import java.util.List;
import static baseballgame.CenterProcess.MAX_VALUE;


public class UserNumber {

    public static final int DEFAULT = 0; // DEFAULT 값 공용으로 사용하기 위해 public

    public List<Integer> userNumberGenerator() {
        List<Integer> userNumber = new ArrayList<>();
        Input input = new Input();
        for (int i = DEFAULT; i < MAX_VALUE; i++) {
            userNumber.add(input.inputNumber());
        }
        return userNumber;
    }

}