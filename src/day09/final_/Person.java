package day09.final_;



final class BagPack{
//    속성
    int size; //가방 크기 (1 ~ 10)
    String brand; //브랜드

    //기능
    void getItem(){
        System.out.println("물건을 가방에서 꺼냄.");
    }

    final void putItem(){
        System.out.println("가방에 물건을 넣습니다.");
    }


    public BagPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }
}

//class smallBagPack extends BagPack{ } //불가





public class Person {
    String name; //이름
    String ssn;//주민번호
    //상수의 규칙 - 불변성, 유일성
    //final은 유일성의 규칙 만족 x
    //static final을 이용해 상수 만듦 -> static 붙어있으므로 initializer를 이용하는게 좋음
//    static final String nation="대한민국"; //국적
    static final String nation;
    static {
        nation="대한민국";
    }



    BagPack bagPack; //가방

    

    public Person(String name, String ssn, String nation, BagPack bagPack) {
        this.name = name;
        this.ssn = ssn;
//        this.nation = nation;
        this.bagPack = bagPack;
    }
}


















