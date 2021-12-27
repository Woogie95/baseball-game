package baseballgame1;

import java.util.List;

public class CenterProcess {
    public static List<Integer> computerRandomNumber = ComputerNumberGenerator.temporaryComputerNumber();

    public static void repeatBaseball() {
        GameRestart gameRestart = new GameRestart();
        ScoreCompare scoreCompare = new ScoreCompare();
        GameRestartCheck gameRestartCheck = new GameRestartCheck();

        gameRestart.baseballRestart();
        while (gameRestart.baseballRestart()) {
            gameRestart.randomNumberContinue();

            while (gameRestart.randomNumberContinue()) {
                for (int a : computerRandomNumber) {
                    System.out.print(a + " ");
                }
                Output.lineChange();
                Output.inputNumberMessage();
                UserNumberGenerator.userNumberCreator(computerRandomNumber);

                int strike = UserNumberGenerator.strike;
                int ball = UserNumberGenerator.ball;

                scoreCompare.compare(strike, ball);
                gameRestartCheck.restartCheck(strike);
            }
        }
    }
}
