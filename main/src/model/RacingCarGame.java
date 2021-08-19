package model;

import utils.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCarGame {
    private RacingCars racingCars;
    private CountOfRaces countOfRaces;
    private List<RaceNumber> raceNumbers;

    public RacingCarGame(String[] cars) {
        racingCars = new RacingCars(cars);
    }

    public void inputCountOfRaces(int number) {
        countOfRaces = new CountOfRaces(number);
    }

    public int getRacingCarsSize() {
        return racingCars.getRacingCars().size();
    }

    public void inputRaceNumber(List<Integer> raceNumbers) {
        this.raceNumbers = raceNumbers.stream().map(RaceNumber::new).collect(Collectors.toList());
    }
}
