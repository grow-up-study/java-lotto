package lotto.message;

public enum Winnings {
    FIRST_PRIZE(2000000000, 1, 0),
    SECOND_PRIZE(30000000, 2, 0),
    THIRD_PRIZE(1500000, 3, 0),
    FOURTH_PRIZE(50000, 4, 0),
    FIFTH_PRIZE(5000, 5, 0);

    private final int money;
    private final int rank;
    private int count;

    Winnings(int money, int rank, int count) {
        this.money = money;
        this.rank = rank;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void plusCount() {
        count++;
    }

    public int getPrize() {
        return money;
    }

    public int gerRank() {
        return rank;
    }

}

