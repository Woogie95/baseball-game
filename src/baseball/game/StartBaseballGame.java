package baseball.game;

public class StartBaseballGame {
    public static void main(String[] args) {
        try {
            CenterProcess centerProcess = new CenterProcess();
            centerProcess.repeatBaseballGame();
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        } catch (Exception e) {
            System.out.println("정상 종료");
        }
    }
}
