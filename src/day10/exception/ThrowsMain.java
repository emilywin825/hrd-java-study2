package day10.exception;

public class ThrowsMain {
    public static void main(String[] args) { //만약 다른 함수들이 main으로 던졌는데 main마져 던지면 예이처리 할 수 없음
        ThrowsExample te=new ThrowsExample();
        int n = te.inputNumber();
        int m = te.convert("100");
        System.out.println(n +"     "+m);
    }
}
