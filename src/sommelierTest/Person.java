package sommelierTest;

public class Person {

    private MemberShip memberShip;

    void test() {
        memberShip = MemberShip.PREMIUM;

        int limitMoney = memberShip.getLimitMoney();
    }
}
