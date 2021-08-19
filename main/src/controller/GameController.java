package controller;

import view.GameView;
import model.RacingCars;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        GameView.startGame();
        RacingCars racingCars = new RacingCars(InputController.inputCars());
        GameView.playGameCount();
    }
}
