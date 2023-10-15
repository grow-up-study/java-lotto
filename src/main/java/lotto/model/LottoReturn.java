package lotto.model;

public class LottoReturn {
    private static double returnOfRate;
    private double roundedRate;
    private final int winningMoney;
    private final int myMoney;

    public LottoReturn(int winningMoney, int myMoney){
        this.winningMoney = winningMoney;
        this.myMoney = myMoney;
    }

    private void calculateReturn(){
        returnOfRate = (double) winningMoney / myMoney;
    }

    private void decimalReturn() {
        calculateReturn();
        returnOfRate *= 100.0;

    }


    public double getReturnOfRate(){
        decimalReturn();
        return returnOfRate;
    }

}
