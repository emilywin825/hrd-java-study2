package day07.util;

import java.util.Scanner;

public class Utility {
    private static Scanner sc=new Scanner(System.in); //밑에 static input에서 써야하므로 static 붙이고 밖에서 사용 못하게 private 붙이고
    private Utility(){}; //이렇게 public 모아둔 클래스에서는 생성자에 private로 접근을 막아서 객체 생성을 해서 접근하지 못하고 클래스명으로 접근하도록 함.

    //구분선을 출력하는 기능
    public static void makeLine(){ //모든 파일에서 이 선 긋는 메소드 다 공유하게 하고 싶어
        //불편하게 객체 만들어서 new Utility() 이렇게 안만들고 그냥 다 쓸 수 있게 -> public static
        System.out.println("=================================");
    }



    //문자열을 입력받는 기능
    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
}
