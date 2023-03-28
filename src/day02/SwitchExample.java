package day02;

import java.util.Scanner;

public class SwitchExample {

    //자바 상수
    public static final String SPRING="봄";
    public static void main(String[] args) {

        System.out.println("### 여행지 추천 ###");
        System.out.println("[ 원하는 계절을 입력하세요. ]");
        System.out.println(">> "); //봄, 여름, 가을, 겨울
        Scanner sc = new Scanner(System.in);

//        String season=sc.nextLine();
//
//        //switch 문에는 정수, 문자형 변수를 써야 함
//        switch (season){ //switch (season.toLowerCase())
//            //case에는 변수 불가능 상수만 가능
//            case SPRING:
//                System.out.println("봄에는 여의도를 가세요!");
//                break; //switch문 탈출
//            case "여름": case "summer": case "SUMMER": //케이스 여러개 일 때
//                System.out.println("여름에는 홍천을 가세요!");
//                break;
//            case "가을":
//                System.out.println("가을에는 춘천을 가세요!");
//                break;
//            case "겨울":
//                System.out.println("겨울에는 스키장을 가세요!");
//                break;
//            default : //else와 같은 효과
//                System.out.println("계절을 잘 입력하세요!!");
//        }

        System.out.print("정말로 종료합니까? [y/n] >>");

        String answer = sc.nextLine();

        switch(answer.charAt(0)){ //answer의 첫번째 인덱스 추출

            case  'y':
                System.out.println("종료");
                break;
            case 'n':
                System.out.println("취소!");
                break;
        }
    }
}
