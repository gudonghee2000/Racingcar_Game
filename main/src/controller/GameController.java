package controller;

import model.RacingCarGame;
import view.GameView;
import model.RacingCars;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        GameView.startGame();
        RacingCarGame racingCarGame = new RacingCarGame(InputController.inputCars());
        GameView.playGameNumber();
        racingCarGame.inputNumberOfGames(InputController.inputNumber());
    }
}
