package model;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCarGame {
    private RacingCars racingCars;
    private CountOfRaces countOfRaces;
    private List<RandomNumbers> randomNumbers;

    public RacingCarGame(String[] cars) {
        racingCars = new RacingCars(cars);
    }

    public void selectCountOfRaces(int number) {
        countOfRaces = new CountOfRaces(number);
    }

    public int getRacingCarsCount() {
        return racingCars.getRacingCarsCount();
    }

    public int getRaceCount() {
        return countOfRaces.getRaceCount();
    }

    public void moveRacingCar(List<Integer> randomNumbers) {
        this.randomNumbers = randomNumbers.stream().map(RandomNumbers::new).collect(Collectors.toList());
        racingCars.moveRacingCars(this.randomNumbers);
    }

    public String[] getRacingCarsName() {
        return racingCars.getCarsName();
    }

    public int[] getRacingCarsPosition() {
        return racingCars.getCarsPosition();
    }

    public List<String> getWinnerName() {
        Winner winner = new Winner(racingCars.getCarsName(), racingCars.getCarsPosition());
        return winner.getWinners();
    }
}