import day02.ArrayCopy;

import java.util.Arrays;

public class ArrayAlgorithm<V> {
    private Object[] sArr; //모든 타입이 다 들어올 수 있음


    //push : 배열 마지막에 데이터 추가
    public void push(V newData){
        Object[]temp=new Object[sArr.length+1];
//        System.arraycopy(sArr, 0, temp, 0,sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            temp[i]=sArr[i];
        }
        temp[temp.length-1]=newData;
        sArr=temp;
    }

    //pop : 배열 마지막에 데이터 삭제
    public V pop(){
        Object[]temp=new Object[sArr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=sArr[i];
        }
        sArr=temp;
        return (V) sArr;
    }
    
    //배열의 중간에 데이터 추가
//    public void
    
    
    //배열 복사
    public void copy(){
        Object[] temp=new Object[sArr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=sArr[i];
        }
    }

    //배열 길이 리턴
    public int length(){
        return sArr.length;
    }

    //배열 내부 데이터 출력
    public String toString(){
        return Arrays.toString(sArr);
    }

    // 배열이 비었는지 확인
    public boolean isEmpty(){
        return sArr.length==0;
    }

    // 배열 데이터 전체삭제
    public void clear(){
//      sArr=null;
        sArr=new Object[0];
    }

    public static void main(String[] args) {
        ArrayAlgorithm ac=new ArrayAlgorithm(10,new Object[]{1,2,3});
        ac.sArr=new Object[]{};
    }
}
