package lotto.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoNumberGeneraterTest {
    @Test
    void 랜덤값_범위_확인() {
        LottoNumberGenerater lottoNumberGenerater = new LottoNumberGenerater();
        List<Integer> numberList = lottoNumberGenerater.generateRandomNumber();

        for(int i = 0; i < 6; i++){
            assertTrue(0 < numberList.get(i) && numberList.get(i) <= 45);

        }
    }
}
