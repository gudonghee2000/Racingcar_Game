package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GameView {
    private GameView() {
    }

    public static void startGame() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void selectPlayGameCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void showCurrentGame(String[] racingCarsName, int[] racingCarsPostion) {
        for (int index = 0; index < racingCarsName.length; index++) {
            showCarName(racingCarsName[index]);
            showCarPosition(racingCarsPostion[index]);
        }
        System.out.println();
    }

    private static void showCarName(String racingCarName) {
        System.out.printf("%s : ", racingCarName);
    }

    private static void showCarPosition(int racingCarPosition) {
        for (int index = 0; index < racingCarPosition; index++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void winnerOfGame(List<String> winners) {
        System.out.print("최종 우승자 : ");
        winners.stream().forEach(winner -> System.out.printf("%s, ", winner));
    }
}
