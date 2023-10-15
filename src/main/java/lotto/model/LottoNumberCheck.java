package lotto.model;


import lotto.message.Winnings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumberCheck {
    private final List<Integer> userNumber;
    private final List<Integer> answerNumber;
    private final int bonusNumber;

    public LottoNumberCheck(List<Integer> answerNumber, List<Integer> userNumber, int bonusNumber) {
        this.answerNumber = answerNumber;
        this.userNumber = userNumber;
        this.bonusNumber = bonusNumber;
    }

    public int checkRank() {
        int rank;
        int commonNumber = countCommonNumber();

        if (commonNumber == 6) {
            rank = Winnings.FIRST_PRIZE.gerRank();
            return rank;
        }
        if (commonNumber == 5) {
            rank = checkBonusNumber(bonusNumber);
            return rank;
        }
        if (commonNumber == 4) {
            rank = Winnings.FOURTH_PRIZE.gerRank();
            return rank;
        }
        if (commonNumber == 3) {
            rank = Winnings.FIFTH_PRIZE.gerRank();
            return rank;
        }
        return 0;
    }

    private int checkBonusNumber(int bonusNumber) {
        int rank = Winnings.THIRD_PRIZE.gerRank();

        if (userNumber.contains(bonusNumber)) {
            rank = Winnings.SECOND_PRIZE.gerRank();
        }

        return rank;
    }


    public int countCommonNumber() {
        Set<Integer> set = new HashSet<>(userNumber);

        int count = 0;
        for (int number : answerNumber) {
            if (set.contains(number)) {
                count++;
                set.remove(number);
            }
        }

        return count;
    }
}
