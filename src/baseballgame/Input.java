package baseballgame;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String EMPTY_TEXT = " "; // 공백 문자가 있어야 함
    private static final int BLANK_TEXT = 0; // 빈 문자
    private static final int MAX_INPUT_NUMBER = 5; // 최대 입력 숫자는 3개지만 (ex) 1 2 3 띄어쓰기 포함해서 상수 5로 지정)
    private static final int INPUT_VALUE_ONE = 1;

    public String inputNumber() { // 메소드 라인 관리를 위해 생성자
        String word = SCANNER.nextLine().trim(); // 1/25 문 자열로 수정//123
        exceptionCheckTest(word);
        return word;

    }

    private void exceptionCheckTest(String word) {
        examineManyInputNumber(word);
        examineBlank(word); // ok
//        examineSpacing(word);
        examineNumberLength(word);
        examineInputOneNumber(word);

    }

    private void examineBlank(String word) { //아무 입력없는 공백
        if (word.length() == BLANK_TEXT) {
            throw new IllegalArgumentException("아무것도 입력하지 않았습니다.");
        }

    }

    private void examineInputOneNumber(String word) { // 숫자 한개 입력 검사
        if (word.length() == INPUT_VALUE_ONE && !word.contains(EMPTY_TEXT)) {
            throw new IllegalArgumentException("숫자를 한개만 입력했습니다.");
        }
    }
//
//    private void examineSpacing(String word) { // 띄어쓰기 검사
//        if (!word.contains(EMPTY_TEXT) || word.length() > MAX_INPUT_NUMBER) {
//            throw new IllegalArgumentException("띄어쓰기를 하지 않았습니다.");
//        }
//    }

    private void examineNumberLength(String word) { // 개수 검사
        if (word.length() != MAX_INPUT_NUMBER && !word.contains(EMPTY_TEXT) || !word.contains(EMPTY_TEXT)) {
            throw new IllegalArgumentException("입력해야 할 숫자 개수가 다릅니다.");
        }
    }

    private void examineManyInputNumber(String word) { // 많은 숫자 입력 검사
        if (word.length() > MAX_INPUT_NUMBER) {
            throw new IllegalArgumentException("입력한 숫자가 너무 많습니다.");
        }
    }

}
