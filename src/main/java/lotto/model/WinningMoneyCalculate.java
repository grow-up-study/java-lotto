package lotto.model;

import main.java.lotto.message.Winnings;

public class WinningMoneyCalculate {
    private final int[] winningMoneyList;
    private int money = 0;

    public WinningMoneyCalculate(int[] winningMoneyList) {
        this.winningMoneyList = winningMoneyList;
        calculateWinningMoney();
    }

    private void calculateWinningMoney() {

        for (int i = 1; i <= 5; i++) {
            money += winningMoneyList[i] * Winnings.values()[i - 1].getPrize();
        }

    }

    public int getWinningMoney() {
        return money;
    }
}

