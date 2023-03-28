package day01;

public class Casting {
    public static void main(String[] args) {

        //upcasting : 작 -> 큰 : 신경쓸 것 x
        byte a = 100;
        int b = a;
        
        
        //+8 : 00001000 //2의 3승 자리가 1이므로 8
        //-8
        // 1의보수 변환 : 비트 반전 -> 11110111
        //2의보수 변환 : +1 => 11111000


        //MSB : 0은 양수, 1은 음수
        //c : 0(MSB) 00000000 00000000 00000011 11101000
        int c = 1000;

        //downcasting : 큰 -> 작 : 직접 형변환 해줘야 하고, 데이터 소실의 위험성이 있음에 주의!!!
        //d는 앞에 다 버리고 11101000만 들고 감 앞에 1은 부호 취급이 됨
        //d: 1 1101000
        byte d = (byte)c;
        System.out.println("d = "+d); //-24

        double x=3.5566;
        int y = (int)x;
        System.out.println("y = "+ y); //3

        // 타입이 다른 데이터의 연산
        // 큰 타입에 맞춰서 변환한 후 연산 진행
        int k=100;
        double j=5.5;
        double v = k + j; //k가 자동으로 double(100.0)로 형변환 됨.
        System.out.println(k+j); //105.5

        char c1='A'; //int 타입으로 형변환
        int alpha=1;
        System.out.println(c1+alpha); //66
//        int보다 작은 데이터(byte, short, char)끼리의 연산은
//        무조건 둘 다 int로 변환됨 -> 안전한 처리를 위해 자바가 자동으로 바꿈ㅎㅎㅎㅎ

        byte b1=100;
        byte b2=20;
        int b3=b1+b2; //b1, b2 둘 다 int로 변환

        System.out.println('가'+'A'); //44097
        System.out.println((char)('가'+'A')); //걁

        int g = 24;
        double result = g / 5.0; //==(double)g / 5;
        System.out.println("result = " + result);

    }
}
