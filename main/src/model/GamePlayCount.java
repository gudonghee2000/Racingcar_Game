package model;

public class GamePlayCount {
    private int raceCount;
    private static final String NUMBER_PATTERN = "^[1-9]+$]";

    protected GamePlayCount(String number) {
        isValidation(number);
        raceCount = Integer.parseInt(number);
    }

    private void isValidation(String number) {
        if (!number.matches(NUMBER_PATTERN)) {
            throw new IllegalArgumentException("[Error] 입력한 경기 회수가 올바른 숫자가 아닙니다.");
        }
    }

    public int getRaceCount() {
        return raceCount;
    }
}
