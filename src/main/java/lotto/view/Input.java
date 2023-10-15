package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import main.java.lotto.ErrorManage;
import main.java.lotto.message.ConsoleMessage;

import java.util.ArrayList;
import java.util.List;

public class Input {
    ErrorManage errorManage = new ErrorManage();

    private int inputMoney() {
        System.out.println(ConsoleMessage.INPUT_MONEY.getMessage());

        int purchaseMoney = Integer.parseInt(Console.readLine());

        errorManage.validateThousandMultiple(purchaseMoney);

        return purchaseMoney;
    }

    public int calculateTrial() {
        int trial = inputMoney() / 1000;
        System.out.printf(ConsoleMessage.PURCHASE_LOTTO.getMessage(), trial);
        System.out.println();

        return trial;
    }


    public List<Integer> inputNumbers() {
        System.out.println(ConsoleMessage.INPUT_LOTTO_NUMBER.getMessage());
        String inputWinningNumbers = Console.readLine();
        String[] numberStrings = inputWinningNumbers.split(",");

        List<Integer> inputNumberList = new ArrayList<>();

        for (String numStr : numberStrings) {
            int num = Integer.parseInt(numStr.trim());
            inputNumberList.add(num);
        }

        return inputNumberList;
    }

    public int inputBonusNumber() {
        System.out.println(ConsoleMessage.INPUT_BONUS_NUMBER.getMessage());
        return Integer.parseInt(Console.readLine());
    }
}
