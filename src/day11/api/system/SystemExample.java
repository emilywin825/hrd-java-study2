package day11.api.system;

import day02.ArrayCopy;

import java.util.Arrays;

public class SystemExample {
    public static void main(String[] args) {
        //currentTimeMillis : 운영체제의 현재 시간 읽기  -> time - time2 해서 코드 실행시간 알 때 사용
        long time=System.currentTimeMillis();
        System.out.println("time = "+time);

        //코드
        long time2=System.currentTimeMillis();

        //배열 카피
        int[] arr={10,20,30};
        int[] copyArr=new int[arr.length];
        System.arraycopy(arr,0,copyArr,0,arr.length); //더 편한 함수들도 있지만 성능상 이게 제일 빠르다고 함 
        System.out.println(Arrays.toString(copyArr));
    }
}
