package day10.generic;

import day07.protec.pac1.A;
import day07.protec.pac1.B;

public class Main {
    public static void main(String[] args) {
        AppleBasket ab=new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb=new BananaBasket();
        bb.setBanana(new Banana());

        Basket<Apple> apples = new Basket<>(); //Apple타입만 담을 수 있음
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); //불가
        
        Apple fruit = apples.getFruit();
        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple()); //불가
        bananas.setFruit(new Banana()); //불가








    } 

}
