package lotto.controller;

import lotto.model.LottoNumberCheck;
import lotto.model.LottoNumberGenerater;
import lotto.model.LottoReturn;
import lotto.model.WinningMoneyCalculate;
import lotto.view.Input;
import lotto.view.Output;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Input input;
    private final Output output;
    private final int[] rankList = new int[6];
    private final List<List<Integer>> userNumberList = new ArrayList<>();

    public Controller() {
        this.input = new Input();
        this.output = new Output();
    }

    public void run() {
        int trial = input.calculateTrial();

        makeUserList(trial);
        output.printLottoNumber(userNumberList);

        final List<Integer> answerNumber = input.inputNumbers();
        System.out.println(answerNumber);
        final int bonusNumber = input.inputBonusNumber();

        makeRankList(answerNumber, bonusNumber);

        output.printWinningStat(rankList);

        WinningMoneyCalculate winningMoneyCalculate = new WinningMoneyCalculate(rankList);
        int winningMoney = winningMoneyCalculate.getWinningMoney();
        System.out.println(winningMoney);

        LottoReturn lottoReturn = new LottoReturn(winningMoney, trial * 1000);
        double rate = lottoReturn.getReturnOfRate();
        output.printRateOfReturn(rate);
    }

    private void makeUserList(int trial) {
        for (int i = 0; i < trial; i++) {
            LottoNumberGenerater lottoNumberGenerater = new LottoNumberGenerater();
            userNumberList.add(lottoNumberGenerater.getUserNumber());
        }
    }

    private void makeRankList(List<Integer> answerNumber, int bonusNumber) {
        for (List<Integer> userNumber : userNumberList) {
            LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
            int rank = lottoNumberCheck.checkRank();
            rankList[rank] += 1;
        }
    }
}
