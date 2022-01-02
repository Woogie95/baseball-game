package baseballgame;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ComputerRandomNumber { //컴퓨터 랜던 숫자 생성 클래스

    public static final int FIXED_NUMBER_COUNT = 9;
    public static final int INTEGER_CHANGE = 1;
    public static final int MAX_RANDOM_VALUE = 3;

    public List<Integer> computerNumberGenerator() {
        Set<Integer> temporaryNumber = new LinkedHashSet<>();
        while (temporaryNumber.size() != MAX_RANDOM_VALUE) {
            temporaryNumber.add((int) (Math.random() * FIXED_NUMBER_COUNT) + INTEGER_CHANGE);
        }
        return new ArrayList<>(temporaryNumber);
    }

}
