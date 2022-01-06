package baseballgame;

public class Output {
    public void printNumberInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printZeroScore() {
        System.out.println("낫싱");
    }

    public void printStrikeScore(int strike) {
        System.out.println(strike + " " + "스트라이크");
    }

    public void printBallScore(int ball) {
        System.out.println(ball + " " + "볼");
    }

    public void printTotalScore(int strike, int ball) {
        System.out.println(strike + " " + "스트라이크" + " " + ball + " " + "볼");
    }

    public void printGameOverMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
