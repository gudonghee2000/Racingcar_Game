package model;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
}
