package day08.poly.car;

import day06.modi.pac2.C;
import day07.util.Utility;

import static day07.util.Utility.makeLine;

public class Main {
    public static void main(String[] args) {
        CarShop shop=new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Stringer());

        makeLine();

        Mustang mustang=new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Stringer stringer=new Stringer();
        stringer.accelerate();

        makeLine();

        Mustang car = (Mustang)shop.exportCar(6000); //타입 내릴때는 이렇게 명시해줘야 함 //타입에 맞게 다운캐스팅해야함. 런타임 시 오류남
        car.powerSound();

        makeLine();
        Car cars =shop.exportCar(5000);
//        System.out.println("car = " + car);
//        car.powerSound(); //불가. powerSound()는 Mustang클래스의 고유 기능이기 떄문

        //instanceof : 어떤 타입의 객체가 저장되는 지에 대한 확인이 필요할 때 사용 (잘 사용은 안함)
        System.out.println(cars instanceof Stringer);
        System.out.println(cars instanceof Tucson);
        System.out.println(cars instanceof Mustang);
    }
}
