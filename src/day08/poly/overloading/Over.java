package day08.poly.overloading;

/*
        오버라이딩 : 부모클래스의 메소드를 자식이 재정의하는 것
        오버로딩 : 하나의 클래스 안에서 같은 이름의 메서드를 여러 개 선언하는 것 -> js는 불가
                -> 조건 : 반드시 매개변수의 타입, 순서, 개수가 달라야 한다.
                          리턴타입과 접근제한자는 관련 x
                -> 사용자가 매우 편하게 사용 가능
                println도 오버로딩
    * */

public class Over {
    //오버로딩
    //데이터를 전달하면 데이터의 타입을 알려주는 기능
    void alertType(String s){
        System.out.println("전달된 데이터는 문자열입니다.");
    }

    void alertType(int x){
        System.out.println("전달된 데이터는 정수입니다.");
    }

    void alertType(int x, int y){}

    void alertType(int x,String y){}
    void alertType(String x,int y){} //순서 다르니까 가능!

    void test(){
        alertType("zzz",10);
        alertType(100,"abcdefg");
    }

}
