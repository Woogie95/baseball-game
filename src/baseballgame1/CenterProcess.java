package baseballgame1;

import java.util.List;

public class CenterProcess {

    public void repeatBaseball() {
        ScoreCompare scoreCompare = new ScoreCompare();
        boolean replay = true;
        while (replay) {
            boolean newGame = true;


            ComputerRandomNumber computerRandomNumber = new ComputerRandomNumber();
            List<Integer> list = computerRandomNumber.computerNumberGenerator();


            UserNumber userNumber = new UserNumber();


            while (newGame) {
                for (int a : list) {
                    System.out.print(a + " ");
                }


                Output.lineChange();
                Output.inputNumberMessage();

                //sdfkfsdkk
                NumberCheck numberCheck = new NumberCheck();
                numberCheck.numberCompare(list, userNumber.userNumberGenerator());

                //sdkdsfkkd
                scoreCompare.compare(numberCheck.getStrike(), numberCheck.getBall());
                GameRestartCheck gameRestartCheck = new GameRestartCheck();


                if (numberCheck.getStrike() == 3) {
                    Output.gameOverMessage();
                    newGame = false;
                    replay = gameRestartCheck.restartCheck();
                }
            }
        }
    }

}
