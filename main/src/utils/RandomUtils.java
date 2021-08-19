package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomUtils {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 10;

    private RandomUtils() {
    }

    private static int createNumber() {
        return RANDOM.nextInt(MAX_NUMBER);
    }

    public static List<Integer> createRaceNumbers(int countOfCars) {
        List<Integer> raceNumbers = new ArrayList<>(countOfCars);
        return raceNumbers.stream().map(number -> RandomUtils.createNumber()).collect(Collectors.toList());
    }
}
