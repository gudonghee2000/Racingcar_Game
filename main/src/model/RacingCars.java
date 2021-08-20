package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingCars {
    private List<Car> racingCars = new ArrayList<>();

    public RacingCars(String[] Cars) {
        inputRacingCars(Cars);
    }

    private void inputRacingCars(String[] cars) {
        isValidationCars(cars);
        racingCars = Arrays.stream(cars).map(Car::new).collect(Collectors.toList());
    }

    private static void isValidationCars(String[] cars) {
        if ((int) Arrays.stream(cars).filter(car -> car.contains(" ")).count() > 0) {
            throw new IllegalArgumentException("[Error] 입력한 자동차 중 이름에 공백이 있는 자동차가 있습니다.");
        }
        if ((int) Arrays.stream(cars).filter(car -> car.length() > 5).count() > 0) {
            throw new IllegalArgumentException("[Error] 입력한 자동차 중 이름이 5자를 넘는 자동차가 있습니다.");
        }
        if (Arrays.stream(cars).distinct().count() != cars.length) {
            throw new IllegalArgumentException("[Error] 입력한 자동차 중 이름이 중복되는 자동차가 있습니다.");
        }
        if (cars.length == 1) {
            throw new IllegalArgumentException("[Error] 입력한 자동차가 한대입니다.");
        }
    }

    public List<Car> getRacingCars() {
        return racingCars;
    }

    public void moveRacingCars(List<RaceNumber> raceNumbers) {
        for (int index = 0; index < raceNumbers.size(); index++) {
            racingCars.get(index).moveRacingCar(raceNumbers.get(index).getRaceNumber());
        }
    }

    public String[] getCarsName() {
        return racingCars.stream().map(racingCars -> racingCars.getName()).toArray(String[]::new);
    }

    public int[] getCarsPosition() {
        return racingCars.stream().mapToInt(racingCar -> racingCar.getPosition()).toArray();
    }
}
fdljjs

