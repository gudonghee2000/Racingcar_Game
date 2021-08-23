package model;

public class Car {
    private final String name;
    private int position = 0;
    private static final int MIN_NUMBER = 4;

    public Car(String name) {
        this.name = name;
    }

    public void moveCar(int randomNumber) {
        if (randomNumber > MIN_NUMBER)
            position += 1;
    }

    public String getCarName() {
        return name;
    }

    public int getCarPosition() {
        return position;
    }
}
