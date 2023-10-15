package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import lotto.ErrorManage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumberGenerater {
    private final List<Integer> userNumber;
    ErrorManage errorManage = new ErrorManage();

    public LottoNumberGenerater() {
        this.userNumber = generateRandomNumber();
    }

    public List<Integer> generateRandomNumber() {
        List<Integer> userNumberList = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));


        sort(userNumberList);

        errorManage.validateDuplicateLotto(userNumberList);

        return userNumberList;
    }

    private void sort(List<Integer> userNumberList) {
        Collections.sort(userNumberList);
    }

    public List<Integer> getUserNumber() {
        return userNumber;
    }
}
