package model;

public class RacingCarGame {
    private RacingCars racingCars;
    private NumberOfRaces numberOfRaces;

    public RacingCarGame(String[] cars) {
        racingCars = new RacingCars(cars);
    }

    public void inputNumberOfGames(int number) {
        numberOfRaces = new NumberOfRaces(number);
    }
}
