package controller;

import model.RacingCarGame;
import utils.RandomUtils;
import view.GameView;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        GameView.startGame();
        RacingCarGame racingCarGame = new RacingCarGame(InputController.inputRacingCars());
        GameView.selectPlayGameCount();
        racingCarGame.selectGamePlayCount(InputController.inputGamePlayCount());

        int gamePlayCount = racingCarGame.getRaceCount();
        while (gamePlayCount > 0) {
            gamePlayCount -= 1;
            racingCarGame.moveRacingCar(RandomUtils.createRandomNumbers(racingCarGame.getRacingCarsCount()));
            GameView.currentCarsPosition(racingCarGame.getRacingCarsName(), racingCarGame.getRacingCarsPosition());
        }
        GameView.winnerOfGame(racingCarGame.getWinnerName());
    }
}
