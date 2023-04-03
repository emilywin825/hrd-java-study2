package day06.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar =new Car("그랜져");
//        myCar.model="페라리488";
//        myCar.speed=10000;
//        myCar.mode='A';

        myCar.setSpeed(150); //150
        myCar.setSpeed(500); //0 -> 다른 값 못넣음. 정보 은닉

        System.out.println(myCar.getSpeed());

        //사용자가 어떤 기능을 사용할 때 pressButton()도 해야하고, inject()도 해야하고, putOil()도 해야하고, moveCylinder()도 해야하면
//        얼마나 불편하겠나구요. 그리고 보안도 안좋아 질 거 아니에요.
        myCar.pressButton(); //pressButton 내부에 밑의 함수들을 캡슐화 하고 pressButton()만 사용자에게 공개 -> 사용자들이 더 편리하게 사용할 수 있음
//        myCar.inject();
//        myCar.putOil();
//        myCar.moveCylinder();
    }
}
