package baseballgame;

import java.util.ArrayList;
import java.util.List;

import static baseballgame.CenterProcess.MAX_VALUE;


public class UserNumber {

    public static final int DEFAULT = 0; // DEFAULT 값 공용으로 사용하기 위해 public

    public List<Integer> makeUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        Input input = new Input();
        int[] num = new int[3];
        char[] chArr = input.inputNumber().toCharArray();
        for (int i = 0; i < num.length; i++) {
            num[i] = chArr[i];
        }
        exceptionInspectTest(num);
        for (int i = DEFAULT; i < MAX_VALUE; i++) {
            userNumber.add(num[i]);
        }
        return userNumber;
    }

    private void exceptionInspectTest(int[] num) {
        inspectNumber(num);
        inspectMinusNumber(num);

    }

    private void inspectNumber(int[] num) {
        for (int i : num) {
            if (i < 0) {
                throw new IllegalArgumentException("숫자가 음수 입니다.");
            }
        }
    }

    private void inspectMinusNumber(int[] num) {
        for (int i : num) {
            if (i % 2 != 0 && i % 2 != 1) {
                throw new IllegalArgumentException("숫자가 아닙니다.");
            }
        }
    }

}