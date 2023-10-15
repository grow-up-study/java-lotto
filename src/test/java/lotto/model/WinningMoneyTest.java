package lotto.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WinningMoneyTest {
    @Test
    void 당첨금_숫자_검증_테스트(){
        WinningMoney winningMoney = new WinningMoney();
        winningMoney.plusWinningMoney(10000);
        winningMoney.plusWinningMoney(2000000000);
        System.out.println(winningMoney);

        assertTrue(winningMoney.getWinningsMoney() == 2000010000);

    }
}
