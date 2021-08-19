package utils;

import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 10;

    private RandomUtils() {
    }

    public static int createRaceNumber() {
        return RANDOM.nextInt(MAX_NUMBER);
    }
}
