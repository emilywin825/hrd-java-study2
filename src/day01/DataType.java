package day01;

import javax.annotation.processing.SupportedSourceVersion;

public class DataType {
    public static void main(String[] args) {

        //컴퓨터에 1000 저장 : 0011 1110 1000 -> 10자리 -> byte 자료형은 8자리만 저장 가능 따라서 short부터 담을 수 있음
        //8bit==1byte
        //1024byte==1kb
        //byte는 알고 있어야 함 : byte에 담아서 보내야하는 데이터가 있음-> 영상 파일 : 1byte단위로 촘촘히 쪼개서 전송 -> int로 보내면 4byte마다 끊기겠쥬?
        int i = 1000; //int : 4byte

        int a = 100;
        // 100을 메모리에 저장(정수 리터럴은 4바이트 할당) -> 주소값이 붙음
        //int a;가 실행 -> 메모리에 4바이트공간 할당 후 이름 a라고 부여
        //a=100; //미리 메모리에 저장된 100을 a에 복사

        long money = 21474836470L; // long money = 21474836470; 이렇게 쓰면 오류 -> 21474836470을 메모리에 저장할 때 4바이트 할당됨.
                                   //L 붙이면 위의 과정에서 8바이트를 할당해줌

        //실수 리터럴은 기본 8바이트 할당
        //float 4바이트 : 다운캐스팅
        float f1=1.23456789F;
        System.out.println("f1 = "+f1);
        
        double d1 = 1.2344556661234345345  ;//double : 15자리 까지 가능. 더 많이 대입하려면 객체 만들어서 double 조합해서 사용
        System.out.println("d1 = "+d1);

        //논리타입
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3=TRUE;

        //문자 타입 : 한글자
        char c1 ='A';
    //  char c2 ='AB'; 불가
        System.out.println((char)(c1+1)); //B

        char c2 = 44032;
        System.out.println("c2 = "+c2); //가
    
        // String : 기본타입이 아니라 객체다 (char 배열)
        String s = "helllo";


    }
}
