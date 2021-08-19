package controller;

import view.GameView;
import model.RacingCarGame;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        GameView.startGame();
        RacingCarGame racingCarGame = new RacingCarGame(InputController.inputCars());
    }
}
