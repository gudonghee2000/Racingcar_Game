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

    public static void playGameCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void nowGame(String[] racingCarsName, int[] racingCarsPostion) {
        for (int index = 0; index < racingCarsName.length; index++) {
            nowCarName(racingCarsName[index]);
            nowCarPosition(racingCarsPostion[index]);
        }
        System.out.println();
    }

    private static void nowCarName(String racingCarName) {
        System.out.printf("%s : ", racingCarName);
    }

    private static void nowCarPosition(int racingCarPosition) {
        for (int index = 0; index < racingCarPosition; index++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
