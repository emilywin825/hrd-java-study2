package day10.collection.set;

/*
*  - 집합 자료구조
* - 저장순서를 보장하지 않음
* - 인덱스, 키를 사용하지 않아서 개별탐색이 불리
* - 저장값의 중복을 허용하지 않음
*/

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<String> foodSet =new HashSet<>();

        //데이터 추가 add(E e)
        boolean flag1= foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        boolean flag2= foodSet.add("김말이");
        foodSet.add("김밥");

        System.out.println(foodSet.size()); //4
        System.out.println(foodSet); //[김밥, 김말이, 단무지, 닭꼬치]

        System.out.println("flag1 = " + flag1); //flag1 = true
        System.out.println("flag2 = " + flag2); //flag2 = false

        for(String food:foodSet){
            System.out.println("food= "+food);
        }
//        food= 김밥
//        food= 김말이
//        food= 단무지
//        food= 닭꼬치

        //remove(obj) : 삭제
        foodSet.remove("단무지");
        System.out.println("foodSet= "+foodSet); //foodSet= [김밥, 김말이, 닭꼬치]

        List<Integer> numbers=new ArrayList<>(
                Arrays.asList(1,1,1,3,3,5,7,9,9)
        );

//        리스트에 담았다가 빨리 중복 제거 할 때 set에 담아버림
        //리스트를 SET으로 변환
        Set<Integer> numberSet=new HashSet<>(numbers);
        System.out.println("numberSet = "+numberSet); //numberSet = [1, 3, 5, 7, 9]
    }
}
