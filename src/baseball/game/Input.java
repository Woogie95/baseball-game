package baseball.game;

import java.util.Scanner;

public class Input {

    private static final int BLANK_TEXT = 0;
    private static final int MIN_ENTER_DEFAULT_VALUE = 3;
    private static final int FIRST_DUPLICATE_VALUE_CHECK = 0;
    private static final int SECOND_DUPLICATE_VALUE_CHECK = 1;
    private static final int THIRD_DUPLICATE_VALUE_CHECK = 2;
    private static final Scanner SCANNER = new Scanner(System.in);

    public String inputNumber() {
        String word = SCANNER.nextLine();
        validateCheckTest(word);
        return word;

    }

    private void validateCheckTest(String word) {
        validateBlank(word);
        validateNumberLength(word);
        validateCheckText(word);

    }

    private void validateBlank(String word) {
        if (word.length() == BLANK_TEXT) {
            throw new IllegalArgumentException("아무것도 입력하지 않았습니다.");
        }

    }

    private void validateNumberLength(String word) {
        if (word.length() != MIN_ENTER_DEFAULT_VALUE) {
            throw new IllegalArgumentException("입력해야 할 숫자 개수가 다릅니다.");
        }
    }

    private void validateCheckText(String word) {
        char[] ch = word.toCharArray();
        if (ch[FIRST_DUPLICATE_VALUE_CHECK] == ch[SECOND_DUPLICATE_VALUE_CHECK] || ch[FIRST_DUPLICATE_VALUE_CHECK] ==
                ch[THIRD_DUPLICATE_VALUE_CHECK] || ch[SECOND_DUPLICATE_VALUE_CHECK] == ch[THIRD_DUPLICATE_VALUE_CHECK]) {
            throw new IllegalArgumentException("중복 입력 또는 음수 입니다.");
        }
    }

}

