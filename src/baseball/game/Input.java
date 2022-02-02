package baseball.game;

import java.util.Scanner;

public class Input {

    private static final int BLANK_TEXT = 0;
    private static final int MIN_ENTER_DEFAULT_VALUE = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    public String inputNumber() {
        String word = SCANNER.nextLine();
        exceptionCheckTest(word);
        return word;

    }

    private void exceptionCheckTest(String word) {
        examineBlank(word);
        examineNumberLength(word);
        examineCheckText(word);

    }

    private void examineBlank(String word) {
        if (word.length() == BLANK_TEXT) {
            throw new IllegalArgumentException("아무것도 입력하지 않았습니다.");
        }

    }

    private void examineNumberLength(String word) {
        if (word.length() != MIN_ENTER_DEFAULT_VALUE) {
            throw new IllegalArgumentException("입력해야 할 숫자 개수가 다릅니다.");
        }
    }

    private void examineCheckText(String word) {
        char[] ch = word.toCharArray();
        if (ch[0] == ch[1] || ch[0] == ch[2] || ch[1] == ch[2]) {
            throw new IllegalArgumentException("중복 입력 또는 음수 입니다.");
        }
    }

}

