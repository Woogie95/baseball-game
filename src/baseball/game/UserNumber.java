package baseball.game;

import java.util.ArrayList;
import java.util.List;

import static baseball.game.CenterProcess.MAX_VALUE;

public class UserNumber {

    public static final int DEFAULT = 0; // DEFAULT 값 공용으로 사용하기 위해 public

    public List<Integer> makeUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        Input input = new Input();
        int[] number = changeText(input.inputNumber());

        for (int i = DEFAULT; i < MAX_VALUE; i++) {
            userNumber.add(number[i]);
        }
        return userNumber;
    }

    private int[] changeText(String word) {
        String[] textArr = new String[3];
        int[] changeArr = new int[3];
        try {
            for (int i = 0; i < word.length(); i++) {
                textArr[i] = String.valueOf(word.charAt(i));
            }
            for (int i = 0; i < word.length(); i++) { // 문자라서 안들어온거
                changeArr[i] = Integer.parseInt(textArr[i]);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
        return changeArr;
    }
}