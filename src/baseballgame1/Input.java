package baseballgame1;

import java.util.Scanner;

public class Input {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static int inputNumber() { // 숫자 입력
        return SCANNER.nextInt();
    }

    public static int newGame() { // 재시작 여부 숫자 입력
        return SCANNER.nextInt();
    }
}
