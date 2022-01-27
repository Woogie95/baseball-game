package baseballgame;

import java.util.Scanner;

public class Input {

    private static final int BLANK_TEXT = 0; // 빈 문자
    private static final int MIN_ENTER_DEFAULT_VALUE = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    public String inputNumber() { // 메소드 라인 관리를 위해 생성자
        String word = SCANNER.nextLine(); // 1/25 문 자열로 수정//123
        exceptionCheckTest(word);
        return word;

    }

    private void exceptionCheckTest(String word) {
        examineBlank(word); // ok
        examineNumberLength(word);
        examineCheckText(word);

    }

    private void examineBlank(String word) { //아무 입력없는 공백
        if (word.length() == BLANK_TEXT) {
            throw new IllegalArgumentException("아무것도 입력하지 않았습니다.");
        }

    }

    private void examineNumberLength(String word) { // 개수 검사
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

