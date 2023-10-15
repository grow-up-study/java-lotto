package lotto.model;

public class WinningMoney {
    public static int winningsMoney = 0;

    public int plusWinningMoney(int money){
        return winningsMoney += money;
    }

    public int getWinningsMoney(){
        return winningsMoney;
    }
}
