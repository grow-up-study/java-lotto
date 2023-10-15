package lotto.view;

import main.java.lotto.message.ConsoleMessage;

import java.util.List;

public class Output {
    public void printLottoNumber(List<List<Integer>> userNumber) {
        for (List<Integer> list : userNumber) {
            System.out.println(list);
        }

    }

    public void printWinningStat(int[] winningList) {
        System.out.println(ConsoleMessage.RESULT_LOTTO.getMessage());


        System.out.printf(ConsoleMessage.CORRECT_NUMBER.getMessage(), 3, "5,000", winningList[5]);
        System.out.printf(ConsoleMessage.CORRECT_NUMBER.getMessage(), 4, "50,000", winningList[4]);
        System.out.printf(ConsoleMessage.CORRECT_NUMBER.getMessage(), 5, "1,500,000", winningList[3]);
        System.out.printf(ConsoleMessage.CORRECT_BONUS_NUMBER.getMessage(), 5, "30,000,000", winningList[2]);
        System.out.printf(ConsoleMessage.CORRECT_NUMBER.getMessage(), 6, "2,000,000,000", winningList[1]);


    }

    public void printRateOfReturn(double rate) {
        System.out.printf(ConsoleMessage.RETURN_RATE.getMessage(), rate);
    }

}


