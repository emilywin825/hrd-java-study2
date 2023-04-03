package day06.modi.pac1;
/*<접근제한자>*/
public class A {
    
    //클래스의 멤버 - 필,메,생
    //필드
    public int f1;
    int f2;  //아무것도 작성 안하면 default 제한
    private int f3;

    //메서드
    public void  m1() {}
    void  m2() {} //default 제한
    private void  m3(){}

    //생성자
   public A(){ //public 안해주면 pac2 패키지의 C파일에서 사용 불가
//        같은 클래스 내에서는 다 호출 가능
        f1=1; f2=2; f3=3;
        m1();  m2(); m3();
        new A(); new A(10); new A("zzz");
    }

    A(int a){}

    private A(String a){};




}
