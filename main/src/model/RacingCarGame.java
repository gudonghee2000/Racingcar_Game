package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RacingCarGame {
    private List<Car> racingCars = new ArrayList<>();

    public RacingCarGame(String[] Cars) {
        inputRacingCars(Cars);
    }

    private void inputRacingCars(String[] Cars) {
        racingCars = Arrays.stream(Cars).map(Car::new).collect(Collectors.toList());
    }

    private void isValidationCars(){
        
    }
}
