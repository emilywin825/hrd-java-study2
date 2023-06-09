package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        //배열 객체 생성
        int[] arr=new int[5]; //주소를 담는 포인터 타입 : 8비트
        System.out.println("arr="+arr);

        arr[0]=50;
        arr[1]=77;
        arr[2]=arr[0]+20;
        arr[3]=(int)66.7;
        arr[4]=100;

        //배열의 길이 - 저장 데이터 개수
        //자바의 배열 immutable(불변셩)
        System.out.printf("배열의 길이 : %d\n",arr.length );

        //배열 반복문 처리 : fori
        for (int i = 0; i <arr.length; i++) {
            System.out.printf("%d번 데이터 : %d\n", i+1, arr[i]);
        }
        //foreach문 : iter
        for(int n : arr) {
            System.out.printf("데이터 : %d\n", n);
        }
    }
}
