package day11.api.string;

import javax.annotation.processing.SupportedSourceVersion;

public class makeString {

    public static void makeString() {
        long start= System.currentTimeMillis();
        String s="";
        for (int i = 0; i < 50000; i++) {
            s+="A";
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요 시간 : "+(end-start)+"밀리초");
    }
    public static void makeStringBuilder() {
        long start= System.currentTimeMillis();
        StringBuilder s= new StringBuilder("");
        for (int i = 0; i < 50000; i++) {
            s.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링빌더 총 소요 시간 : "+(end-start)+"밀리초");
    }

    public static void main(String[] args) {
        makeString();
        makeStringBuilder();

        //오토 박싱 -> 이렇게 하면 Object 클래스와 상속관계가 생김 -> 객체 타입이니까
        Integer a=10;
        Character c='A';
        Byte b=1;
        Double d =11.1;
//        !!Integer a; -> 기본값 null;
//            int a; -> 기본값 0 -> 사용하고 싶은거에 따라서 선택해서 사용
    }
}
