package day07.static_;

import java.sql.SQLOutput;

public class Count {

    //제한자(modifier)
    //접근 제한자(Access), 사용 제한자(Usage)
    public static int x; //정적 필드 : 모든 객체가 공유  -> Count 객체가 100개 만들어져도 x는 1개 만들어짐
    public int y; //인스턴스 필드 (=static 안붙인거) : 객체별로 관리 -> Count 객체가 100개 만들어지면 y도 100개 만들어짐

    //정적 메서드
    public static void m1(/*Count c4*/){
        System.out.println("static 메서드 호출!");

        //필드 참조 (static 메서드 안에서는 static 필드만 참조 가능)
        //static은 this정보를 알 수가 없어서 호출 불가능. 하지만 static도 this 정보를 안다면 호출 가능.
        System.out.println("x = "+x);
//        System.out.println("y = "+y);  //만약 Count 객체가 여러개라면 y도 여러개 그러면 어떤 y를 대려와야 할 지 모르게 되니까 오류
        //m1을 호출할 때 클래스명.m1() 이렇게 호출하므로 this정보를 알 수 없음 그니까 오류

        Count c3 = new Count(); //static 내부에서 static 안붙은 데이터 사용하려면 객체 생성해서 사용!!!!
        System.out.println("c3.y=" + c3.y); //이렇게 하면 this가 c3라는 걸 아니까 가능
//        System.out.println("c4.y = "+c4.y); //이렇게하면 c4를 매개변수로 받아오니까 this를 알 수 있으니까 가능
    }

    //인스턴스 메서드 (static 붙었던 안 붙었던 참조 가능)
    public void m2(){
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x = "+x);
        System.out.println("y = "+y); //이건 가능
        //m2를 호출할 때는 this를 알 수 밖에 없으니까 가능
    }

}
