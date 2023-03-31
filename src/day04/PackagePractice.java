package day04;

//import fruit.Banana;
//import fruit.Grape;
import fruit.*; //이거는 warm까지는 포함하지 않음
import fruit.warm.PineApple;


public class PackagePractice {
    public static void main(String[] args) {
        new juice.Apple();
        new juice.Apple();

        Banana banana = new Banana();
        new Grape();
    }

}
