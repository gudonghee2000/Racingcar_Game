package model;

public class GamePlayCount {
    private int raceCount;

    protected GamePlayCount(String number) {
        isValidation(number);
        raceCount = Integer.parseInt(number);
    }

    private void isValidation(String number) {
        if (!number.matches("^[1-9]+$]")) {
            throw new IllegalArgumentException("[Error] 입력한 경기 회수가 올바른 숫자가 아닙니다.");
        }
    }

    public int getRaceCount() {
        return raceCount;
    }
}
