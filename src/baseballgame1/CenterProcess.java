package baseballgame1;

public class CenterProcess {

    public boolean replay = true;
    public boolean newGame = true;
    public ComputerRandomNumber computerRandomNumber = new ComputerRandomNumber();
    public UserNumber userNumber = new UserNumber();

    public void repeatBaseball() {

        while (replay) {
            newGame = true;
            computerRandomNumber.computerNumberGenerator();
            userNumber.userNumberGenerator();

            while (newGame) {
                for (int a : computerRandomNumber.computerNumberGenerator())
                    System.out.print(a + " ");
            }
            Output.lineChange();
            Output.inputNumberMessage();

            NumberCheck numberCheck = new NumberCheck();
            numberCheck.numberCompare(computerRandomNumber.computerNumberGenerator(), userNumber.userNumberGenerator());
            ScoreCompare scoreCompare = new ScoreCompare();
            scoreCompare.compare(numberCheck.getStrike(), numberCheck.getBall());
            GameRestartCheck gameRestartCheck = new GameRestartCheck();
            gameRestartCheck.restartCheck(numberCheck.getStrike());

        }
    }

    public void clear() {
        computerRandomNumber.computerNumberGenerator().clear();
        userNumber.userNumberGenerator().clear();
    }
}
