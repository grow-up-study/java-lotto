package lotto.message;

public enum ErrorMessage {
    NOT_NUMBER("숫자를 입력해주세요."),
    NOT_THOUSAND("1,000원 단위로 입력해주세요"),
    NOT_6_NUMBER("숫자 6개를 입력해주세요"),
    NOT_RANGE_NUMBER("1에서 45사이의 숫자를 입력해주세요"),
    INCORRECT_FORM(" \' , \' 기준으로 입력해주세요"),
    Duplicate_Numner("중복되는 숫자가 있습니다!");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
