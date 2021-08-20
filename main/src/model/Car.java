package model;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void moveRacingCar(int raceNumber) {
        if (raceNumber > 4)
            position += 1;
    }

    public int getPosition() {
        return position;
    }
}
