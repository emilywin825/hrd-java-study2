package day04;

//import fruit.Banana;
//import fruit.Grape;
import fruit.*; //이거는 warm(하위 폴더)까지는 포함하지 않음
import fruit.warm.PineApple;
import juice.*;
import juice.Apple;

public class PackagePractice {
    public static void main(String[] args) {

        //전부 다른 패키지에 있는 클래스들이므로 import를 선언해서 서ㅏ용
        new juice.Apple();
        new fruit.Apple();
//        위에서 furit.*로 import 했으므로 바로 사용 가능
        Banana banana = new Banana();
        new Grape();
        new PineApple();

        Apple apple=new Apple();

    }
}
