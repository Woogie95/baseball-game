package baseball.game;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static baseball.game.CenterProcess.MAX_VALUE;

public class ComputerRandomNumber {

    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int CHANGE_TO_INTEGER = 1;

    public List<Integer> makeComputerNumber() {
        Set<Integer> temporaryNumber = new LinkedHashSet<>();
        while (temporaryNumber.size() != MAX_VALUE) {
            temporaryNumber.add((int) (Math.random() * MAX_RANDOM_NUMBER) + CHANGE_TO_INTEGER);
        }
        return new ArrayList<>(temporaryNumber);
    }

}
