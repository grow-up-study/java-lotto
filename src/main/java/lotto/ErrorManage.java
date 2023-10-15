package lotto;

import main.java.lotto.message.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ErrorManage {
    public void validateThousandMultiple(int number) {
        if ((number % 1000) != 0){
            throw new IllegalArgumentException(ErrorMessage.NOT_THOUSAND.getMessage());
        }
    }

    public void validateNumberRange(int number){
        if( !((number >= 1) && (number <= 45))){
            throw new IllegalArgumentException(ErrorMessage.NOT_RANGE_NUMBER.getMessage());
        }
    }

    public void validateDuplicateLotto(List<Integer> LottoList){
        Set<Integer> checkDuplicate = new HashSet<>();
        int length = LottoList.size();

        checkDuplicate.addAll(LottoList);

        if(length != checkDuplicate.size()){
            throw new IllegalArgumentException(ErrorMessage.Duplicate_Numner.getMessage());
        }
    }

    public void validateSixNumber(List<Integer> LottoList){
        if(LottoList.size() != 6){
            throw new IllegalArgumentException(ErrorMessage.NOT_6_NUMBER.getMessage());
        }
    }
}
