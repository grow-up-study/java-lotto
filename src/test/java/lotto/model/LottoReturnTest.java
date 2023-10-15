package lotto.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoReturnTest {
    @Test
    void 수익률_숫자_검증_테스트(){
        LottoReturn lottoReturn = new LottoReturn(10000, 3000);
        LottoReturn lottoReturn2 = new LottoReturn(2000000, 65000);

        System.out.println(lottoReturn.getReturnOfRate());
        System.out.println(lottoReturn2.getReturnOfRate());

        assertTrue(lottoReturn.getReturnOfRate() == 3.33);
        assertTrue(lottoReturn2.getReturnOfRate() == 30.77);
    }
}
