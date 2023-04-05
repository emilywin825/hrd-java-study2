package day07.static_;

import day07.util.Utility;

import static day07.static_.Count.*;
import static day07.util.Utility.makeLine;

public class Main {
    public static void main(String[] args) {

        //static 데이터는 객체 안 만들어도 접근 가능
        System.out.println(Count.x);
//        System.out.println(Math.random()); //random 메소드도 static
        Count c1 = new Count();
        Count c2 = new Count();

//        c1.x=10;
//        c2.x++;
//어차피 x는 static 이므로 위에처럼 안쓰고 클래스 이름으로 접근. 위에처럼해도 오류는 아님
        Count.x=10;
        c2.y=20;

        m1();
        c1.m2();

        System.out.printf("c1 = x : %d, y : %d\n",c1.x,c1.y);
        System.out.printf("c2 = x : %d, y : %d\n",c2.x,c2.y);

        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        cal2.color="초록";

        System.out.println("cal1"+cal1.color);

        makeLine();//==Utility.makeLine(); (위에 import 했으므로)
    }
}
