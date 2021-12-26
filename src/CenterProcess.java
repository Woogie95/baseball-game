import java.util.List;

public class CenterProcess {
    public static List<Integer> computerRandomNumber = ComputerNumberGenerator.temporaryComputerNumber();

    public static void repeatBaseball() {
        int input = Input.numberInput();
        UserNumberGenerator.userNumberCreator(input, computerRandomNumber);
        while (true) {
            while (true) {
                for (int a : computerRandomNumber) {
                    System.out.print(a + " ");
                }
                Output.lineChange();
                Output.numberInputMessage();
            }
        }
    }
}
