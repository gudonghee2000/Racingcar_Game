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
        racingCarGame.selectCountOfRaces(InputController.inputCountofRaces());

        int playGameCount = racingCarGame.getRaceCount();
        while (playGameCount > 0) {
            playGameCount -= 1;
            racingCarGame.moveRacingCar(RandomUtils.createRandomNumbers(racingCarGame.getRacingCarsCount()));
            GameView.showCurrentGame(racingCarGame.getRacingCarsName(), racingCarGame.getRacingCarsPosition());
        }
        GameView.winnerOfGame(racingCarGame.getWinnerName());
    }
}
