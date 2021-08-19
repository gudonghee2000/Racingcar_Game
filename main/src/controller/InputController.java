package controller;

import java.util.Scanner;

public class InputController {
    final static Scanner scanner = new Scanner(System.in);

    private InputController() {
    }

    public static String[] inputCars() {
        String[] Cars = scanner.nextLine().split(",");
        return Cars;
    }

    public static int inputRaceCount() {
        return scanner.nextInt();
    }
}
