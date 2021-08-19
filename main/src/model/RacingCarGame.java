package model;

public class RacingCarGame {
    private RacingCars racingCars;
    private CountOfRaces countOfRaces;

    public RacingCarGame(String[] cars) {
        racingCars = new RacingCars(cars);
    }

    public void inputCountOfRaces(int number) {
        countOfRaces = new CountOfRaces(number);
    }
}
