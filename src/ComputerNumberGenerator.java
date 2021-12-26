import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ComputerNumberGenerator {
    public static final int FIXED_NUMBER_COUNT = 9;
    public static final int INTEGER_CHANGE = 1;
    public static Set<Integer> temporaryNumber = new LinkedHashSet<>();

    public static List<Integer> temporaryComputerNumber() {

        while (temporaryNumber.size() != 3) {
            temporaryNumber.add((int) (Math.random() * FIXED_NUMBER_COUNT) + INTEGER_CHANGE);
        }
        return new ArrayList<>(temporaryNumber);
    }
}
