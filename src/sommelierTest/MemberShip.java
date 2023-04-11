package sommelierTest;

public enum MemberShip {
    BASIC(50000),
    PREMIUM(100000),
    VIP(150000);

    private int limitMoney;

    MemberShip(int limitMoney) {
        this.limitMoney = limitMoney;
    }

    public int getLimitMoney() {
        return limitMoney;
    }
}
