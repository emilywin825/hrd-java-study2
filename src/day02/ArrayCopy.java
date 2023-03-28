package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //배열 복사 알고리즘
        String[] pets = new String[] {"멍멍이", "야옹이", "짹짹이"};
        //선언과 동시에 초기화한다면 new Type[] 생략가능 //변수 만들 때 외에는 꼭 붙여야함!!!!!!!!!!
        String[] pets2 = {"멍멍이","야옹이","짹짹이"};
//        pets[0]="멍멍이";
//        pets[1]="야옹이";
//        pets[2]="짹짹이";

//        for(String p : new String[] {"야옹이","냠냠이","콩콩이"}){ }

        //<배열 제대로 복사 안되는 경우>
//        String[] petsCopy = pets; //배열 주소 복사 //스택 사본뜬거. 힙 사본떠야 진짜 복사
//        pets[1] = "사마귀";
//
//        //원본 주소, 사본 주소 동일
//        System.out.println("원본주소 : "+ pets); //원본주소 : [Ljava.lang.String;@1554909b
//        System.out.println("사본주소 : "+ petsCopy); //사본주소 : [Ljava.lang.String;@1554909b
//
//        //원본, 사본이 같이 변경.
//        System.out.println("원본배열 : "+ Arrays.toString(pets)); //원본배열 : [멍멍이, 사마귀, 짹짹이]
//        System.out.println("사본배열 : "+ Arrays.toString(petsCopy)); //사본배열 : [멍멍이, 사마귀, 짹짹이]

        //<배열을 제대로 복사하는 방법>
        //1. 원본과 동일한 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];
        
        //2. 원본의 각 인덱스값들을 사본에 인덱스로 일일히 복사
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }
        pets[1] = "사마귀";
        //원본 주소, 사본 주소  달라짐
        System.out.println("원본주소 : "+ pets); //원본주소 : [Ljava.lang.String;@1554909b
        System.out.println("사본주소 : "+ petsCopy); //사본주소 : [Ljava.lang.String;@6bf256fa
        //원본만 달라짐
        System.out.println("원본배열 : "+ Arrays.toString(pets)); //원본배열 : [멍멍이, 사마귀, 짹짹이]
        System.out.println("사본배열 : "+ Arrays.toString(petsCopy)); //사본배열 : [멍멍이, 야옹이, 짹짹이]

    }
}
