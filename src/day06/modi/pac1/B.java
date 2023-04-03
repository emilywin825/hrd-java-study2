package day06.modi.pac1;

 class B { //default 제한 : 클래스에는 public과 default만 사용 가능
     //클래스 레벨에서 default 제한을 걸어버리면 내부에 있는 데이터들이 public이던 뭐던 외부에서는 아예 접근 불가

    public int x1;
    int x2;
    private int x3;


    void test(){
        A a=new A(); //public
        new A(10); //default
//        new A("zzzz"); //private

        a.f1 = 1;  //publics
        a.f2 = 2; //default (동일한 패키지 내부이므로 접근 가능)
//        a.f3 = 3; //private (다른 클래스이므로 불가!!!!)

        a.m1(); //public
        a.m2(); //default
//        a.m3(); //private
    }

}
