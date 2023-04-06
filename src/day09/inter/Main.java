package day09.inter;

import day07.protec.pac1.B;

public class Main {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();

        bullDog.hunt();
        bullDog.violent();

        Duck duck = new Duck();
        duck.eat();

        //인터페이스는 다형성을 구현하는 역할
        //인터페이스도 부모 타입으로 사용 가능
        Pet[] pets={
                bullDog,duck,new BullDog(),
        };
        for(Pet pet : pets){
            pet.eat();
        }

        BadAnimal shark=new Shark();
        shark.hunt();

    }
}
