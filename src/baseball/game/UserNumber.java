package baseball.game;

import java.util.ArrayList;
import java.util.List;

import static baseball.game.CenterProcess.MAX_VALUE;

public class UserNumber {

    public static final int DEFAULT = 0;
    private static final int BLANK_TEXT = 0;
    private static final int MIN_DEFAULT_VALUE = 3;
    private static final int FIRST_DUPLICATE_VALUE_CHECK = 0;
    private static final int SECOND_DUPLICATE_VALUE_CHECK = 1;
    private static final int THIRD_DUPLICATE_VALUE_CHECK = 2;

    public List<Integer> makeUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        Input input = new Input();
        int[] number = changeText(validateCheckTest(input.inputNumber()));

        for (int i = DEFAULT; i < MAX_VALUE; i++) {
            userNumber.add(number[i]);
        }
        return userNumber;
    }

    private int[] changeText(String word) {
        String[] textArr = new String[MIN_DEFAULT_VALUE];
        int[] changeArr = new int[MIN_DEFAULT_VALUE];

            for (int i = DEFAULT; i < word.length(); i++) {
                textArr[i] = String.valueOf((word.charAt(i)));
            }
            for (int i = DEFAULT; i < word.length(); i++) {
                changeArr[i] = Integer.parseInt(textArr[i]);
        }
        return changeArr;
    }

    private String validateCheckTest(String word) {
        validateBlank(word);
        validateNumberLength(word);
        validateCheckText(word);

        return word;
    }

    private void validateBlank(String word) {
        if (word.length() == BLANK_TEXT) {
            throw new IllegalArgumentException("아무것도 입력하지 않았습니다.");
        }

    }

    private void validateNumberLength(String word) {
        if (word.length() != MIN_DEFAULT_VALUE) {
            throw new IllegalArgumentException("입력해야 할 숫자 개수가 다릅니다.");
        }
    }

    private void validateCheckText(String word) {
        char[] ch = word.toCharArray();
        if (ch[FIRST_DUPLICATE_VALUE_CHECK] == ch[SECOND_DUPLICATE_VALUE_CHECK] || ch[FIRST_DUPLICATE_VALUE_CHECK] ==
                ch[THIRD_DUPLICATE_VALUE_CHECK] || ch[SECOND_DUPLICATE_VALUE_CHECK] == ch[THIRD_DUPLICATE_VALUE_CHECK]) {
            throw new IllegalArgumentException("중복 입력 입니다.");
        }
    }
}