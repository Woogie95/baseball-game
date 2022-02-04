package baseball.game;

public class BaseballGameApplication {
    public static void main(String[] args) {
        try {
            CenterProcess centerProcess = new CenterProcess();
            centerProcess.repeatBaseballGame();
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        }
    }

}
