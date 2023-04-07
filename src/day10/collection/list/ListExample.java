package day10.collection.list;


import day07.protec.pac1.A;
import day07.util.Utility;

import java.util.*;

import static day07.util.Utility.makeLine;

/*
    - 저장 데이터의 순서를 보장
    - 인덱스를 가지고 있음
    -중복 데이터를 저장 가능
* */
public class ListExample {
    public static void main(String[] args) {

//      ArrayList<Object> foodList = new ArrayList<>(); //이렇게하면 ArrayList외에 사용 못하니까 부모인 List타입으로 해서 사용하는게 편리
        List<String> foodList = new ArrayList<>();

        //add(E e) : 맨 끝 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("타코");
        foodList.add("피자");

        //add(index, element) : element번째 자리로 중간 삽입
        foodList.add(2,"족발");


        //size() : 저장된 데이터 개수 반환
        int size=foodList.size();
        System.out.println("size = "+ size);

        System.out.println(foodList); //foodList.toString()에서 toString() 생략 가능(객체에 주소값 있는 경우)

        //indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("파스타");
        System.out.println("index = " + index);

        //includes(E e) : 해당 데이터 저정 유무 확인
        System.out.println(foodList.contains("짜장면"));
        System.out.println(foodList.contains("마파두부"));

        //remvoe(index), remove(obj(=값))
        String removedFood=foodList.remove(1); //인덱스로 지우면 삭제한 값 return
        foodList.remove("파스타");
        System.out.println("foodList = "+foodList);

        //set(index, newElement) : 수정
        foodList.set(0,"동파육");
        System.out.println("foodList = "+foodList);

        //get(index) : 리스트에 저장된 데이터 참조 (복사본 가져옴)
        String s=foodList.get(1);
        System.out.println("s = "+s);


        makeLine();
        for (int i = 0; i >foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }

        makeLine();
        for (Object food : foodList) { //iter 사용 가능
            System.out.println("food = "+food);
        }

        //clear() : 네부 데이터 전체삭제
        foodList.clear();
        System.out.println("foodList = "+foodList);
        System.out.println(foodList.isEmpty());

        //리스트에 초기값 넣고 시작하기
        List<Object> tvxq = new ArrayList<>(
                Arrays.asList("유노윤호", "최강창민") //배열의 클래스 : Arrays
        );
        System.out.println("tvxq" + tvxq);

        //정렬 (듀얼 피벗 큇 정렬) -> 엄청 빠름
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5,30,20,6,17,41,2)
        );
        makeLine();
        System.out.println("numbers = "+numbers);

        //오름차 정렬
        Collections.sort(numbers);
        System.out.println("numbers = "+numbers);

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = "+numbers);



    }
}
