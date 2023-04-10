package day08.poly.car;


import day06.modi.pac2.C;

public class CarShop{
    

//    Mustang[] mustangs;
//    Stringer[] stringers;
//    Tucson[] tucsons;
// 많은 차 객체들을 다 관리하려면 위에 코드들 처럼 객체를 하나하나 다 만들어야 하는데 그렇게 할 순 없으니까
    Car[] cars;


    //대리점에 차를 입고하는 기능
    public void importCar(){
//        Car m=new Mustang();
//        Car S=new Mustang();
//        Car T=new Mustang();

        cars=new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stringer(), //상속 아니였으면 불가-> 자바의 배열은 같은 타입만 넣을 수 있음
                new Tucson(),
        };

        //문자열과 정수와 논리를 배열에 담을 수 있는가? 최상위 클래스인 Object타입으로 배열을 만들면 다 담을 수 있음
        //하지만 좋지는 않음
//        Object[] oArr={
//                50,30,3.3,"zzzz",false,
//                new Mustang()
//        };

    }

    public void runTest(){
        importCar();//차입고
        for (Car car : cars){
            car.accelerate();
        }
    }

    //차를 고객에게 인도하는 기능
    // return 타입의 다형성
    public Car exportCar(int money){
        if(money==6000){
            return new Mustang();
        } else if(money==5000){
            return new Stringer();
        } else if (money==3000) {
            return new Tucson();
        }else {
            return null;
        }
    }
}
