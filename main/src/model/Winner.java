package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Winner {
    private List<String> Winners = new ArrayList<>();

    protected Winner(String[] racingCarsName, int[] racingCarsPosition) {
        int m = 0;
        for (int index = 0; index < racingCarsPosition.length; index++) {
            if (racingCarsPosition[index] > m) {
                m = racingCarsPosition[index];
            }
        }
        for (int index = 0; index < racingCarsPosition.length; index++) {
            if (racingCarsPosition[index] == m) {
                Winners.add(racingCarsName[index]);
            }
        }
    }

    public List<String> getWinners() {
        return Winners;
    }
}
