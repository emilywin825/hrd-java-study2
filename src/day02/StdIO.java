package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {

    public static void main(String[] args) throws IOException {
        String dog="멍멍이", cat="야옹이";

        System.out.println(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni ="개천절";

        System.out.println(month+"월"
                            +day+"일은"
                            +anni+"입니다.");

        // %d  :정수, %s : 문자열, %f :실수
        System.out.printf("%d월 %d일은 %s입니다.",month,day,anni); //줄개행 기능 없음
        double rate=25.4567;
        System.out.printf("오늘의 할인율은 %.4f입니다.\n",rate); //%f는 무조건 소수점 6자리까지 출력함. 자리수 조절하고 싶으면 %.4f이렇게 조절
        System.out.printf("오늘의 할인율은 %.4f%%입니다.\n",rate);

//        int result = System.in.read();
//        System.out.println("result = " + result);

        //표준입력
        Scanner scanner = new Scanner(System.in);

//        int result = scanner.nextInt(); //사용 안하는게 좋음
        String str=scanner.nextLine();


        int result=0;
        try{
            result=Integer.parseInt(str); //Integer.parseInt : String to int
        } catch(Exception e) {
            System.out.println("정수로 입력하거라~");
        }

        System.out.println("result = " + result);





        System.out.println("result = " + result);

        System.out.println("result = " + result);

    }
}
