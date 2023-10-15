package lotto.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LottoNumberCheckTest {
    @Test
    void 모든_번호가_동일_1등() {
        List<Integer> answerNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int bonusNumber = 7;

        LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
        int rank = lottoNumberCheck.checkRank();

        assertEquals(1, rank);
    }

    @Test
    void 보너스_번호_동일_2등() {
        List<Integer> answerNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        int bonusNumber = 7;

        LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
        int grade = lottoNumberCheck.checkRank();

        assertEquals(2, grade);
    }

    @Test
    void 보너스_번호_다름_3등() {
        List<Integer> answerNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        int bonusNumber = 8;

        LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
        int grade = lottoNumberCheck.checkRank();

        assertEquals(3, grade);
    }

    @Test
    void 번호_4개_동일_4등() {
        List<Integer> answerNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 8, 7));
        int bonusNumber = 8;

        LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
        int grade = lottoNumberCheck.checkRank();

        assertEquals(4, grade);
    }

    @Test
    void 번호_3개_동일_5등() {
        List<Integer> answerNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 9, 8, 7));
        int bonusNumber = 8;

        LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
        int grade = lottoNumberCheck.checkRank();

        assertEquals(5, grade);
    }

    @Test
    void 꽝() {
        List<Integer> answerNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1, 2, 10, 9, 8, 7));
        int bonusNumber = 8;

        LottoNumberCheck lottoNumberCheck = new LottoNumberCheck(answerNumber, userNumber, bonusNumber);
        int grade = lottoNumberCheck.checkRank();

        assertEquals(0, grade);
    }
}
