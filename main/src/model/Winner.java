package model;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<String> winners = new ArrayList<>();

    protected Winner(String[] racingCarsName, int[] racingCarsPosition) {
        int m = maxCarPosition(racingCarsPosition);
        for (int index = 0; index < racingCarsPosition.length; index++) {
            if (racingCarsPosition[index] == m) {
                winners.add(racingCarsName[index]);
            }
        }
    }

    private int maxCarPosition(int[] racingCarsPosition) {
        int maxPosition = 0;
        for (int index = 0; index < racingCarsPosition.length; index++) {
            if (racingCarsPosition[index] > maxPosition) {
                maxPosition = racingCarsPosition[index];
            }
        }
        return maxPosition;
    }

    public List<String> getWinners() {
        return winners;
    }
}
