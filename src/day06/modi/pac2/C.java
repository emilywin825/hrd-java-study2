package day06.modi.pac2;

import day06.modi.pac1.A;

    public class C {
        void test(){
            A a = new A();
            a.f1=10; //public
    //      a.f2=20; //default
    //      a.f3=30; //private

            a.m1(); //public
    //      a.m2(); //default
    //      a.m3(); //private

            // 클래스 B가 default 이므로 접근 불가
    //        B b=new B();
    //        b.x1=1;
        }
    }
