package baseballgame1;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    public List<Integer> userNumber = new ArrayList<>();

    public List<Integer> userNumberGenerator() {
        for (int i = 0; i < 3; i++) {
            userNumber.add(Input.inputNumber());
        }
        return userNumber;
    }
}