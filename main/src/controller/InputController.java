package controller;

import java.util.Scanner;

public class InputController {
    final static Scanner scanner = new Scanner(System.in);

    private InputController() {
    }

    public static String[] inputRacingCars() {
        String[] Cars = scanner.nextLine().split(",");
        return Cars;
    }

    public static String inputGamePlayCount() {
        return scanner.nextLine();
    }
}
