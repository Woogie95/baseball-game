package baseball.game;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String inputNumber() {
        return SCANNER.nextLine();
    }

}

