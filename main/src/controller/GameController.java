package controller;

import model.RacingCarGame;
import utils.RandomUtils;
import view.GameView;
import model.RacingCars;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        int gameOver = 0;
        GameView.startGame();
        RacingCarGame racingCarGame = new RacingCarGame(InputController.inputCars());
        GameView.playGameCount();
        racingCarGame.inputCountOfRaces(InputController.inputRaceCount());

        racingCarGame.inputRaceNumber(RandomUtils.createRaceNumbers(racingCarGame.getRacingCarsSize()));
    }
}
