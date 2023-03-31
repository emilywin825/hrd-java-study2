package day03;

import java.util.Arrays;

public class ArrayInsert {
    static int[] arr = {10,20,30,40,50};
    public static void insert(int newData,int targetIndex){
        //newData : 25 -> 20이랑 30사이에 넣고 싶음

        int[] temp = new int[arr.length+1]; //6개

        for (int i = 0; i < arr.length; i++) { //1. 배열의 사이즈를 먼저 1 늘려놓음
            temp[i]=arr[i]; //2. 원본배열을 다 복사해놓음
        }

        for (int i = temp.length-1; i > targetIndex ; i--) {
            temp[i] = temp[i-1];  //3. 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 민다.
        }

        temp[targetIndex]=newData; //4. 타겟인덱스 자리에 새 데이터를 넣는다.

        arr=temp; temp=null;  //5. 주소를 바꾼다.
    }

    public static void main(String[] args) {
        //1. 배열의 사이즈를 먼저 1 늘려놓음
        //2. 원본배열을 다 복사해놓음
        //3. 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 민다.
        //4. 타겟인덱스 자리에 새 데이터를 넣는다.
        //5. 주소를 바꾼다.
        int newData = 90; //2번 인덱스에 넣어야함
        int targetIndex = 5;

        insert(newData,targetIndex);

        System.out.println(Arrays.toString(arr)); //[10, 20, 30, 40, 50, 90]
    }
}
