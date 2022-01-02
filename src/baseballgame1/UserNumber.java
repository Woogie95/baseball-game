package baseballgame1;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    public List<Integer> userNumberGenerator() { //유저가 숫자 입력하면 한개씩 리스트에 넣어서 리턴해서 센터 프로세서줘
        List<Integer> userNumber = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            userNumber.add(Input.inputNumber());
        }
        return userNumber;
    }
}