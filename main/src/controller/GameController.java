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

        while (gameOver != racingCarGame.getRaceCount()) {
            gameOver += 1;
            racingCarGame.moveRacingCar(RandomUtils.createRaceNumbers(racingCarGame.getRacingCarsSize()));
            GameView.nowGame(racingCarGame.getRacingCarsName(), racingCarGame.getRacingCarsPosition());
        }
    }
}
