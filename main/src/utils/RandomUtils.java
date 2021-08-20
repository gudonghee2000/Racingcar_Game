package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 10;

    private RandomUtils() {
    }

    private static int createNumber() {
        return RANDOM.nextInt(MAX_NUMBER);
    }

    public static List<Integer> createRandomNumbers(int countOfCars) {
        List<Integer> randomNumbers = new ArrayList<>(countOfCars);
        for (int index = 0; index < countOfCars; index++) {
            randomNumbers.add(createNumber());
        }
        return randomNumbers;
    }
}
