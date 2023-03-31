package day04;

public class FieldAndLocal {

    int a; //필드 : 초기화 안해도 객체 생성시 자동으로 초기값 들어감

    
    void mm(int b){ // b : 매개변수 -> 어짜피 mm호출할 때 무조건 들어오므로 초기화 안해도 오류x
//        int c; // c : 지역변수 -> 호출 시점에 아무값도 안들어 있으면 오류
        int c=100;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
