package day03;

public class MethodBasic {
    //함수 : 코드 블록의 기능적 표현
    //ex)add(10,20)
//
//    메서드 : 객체의 동작 표현 -> 자바는 무조건 메서드
//    ex) 샤프계산기.add(10,20);

//    자바는 모든것을 객체로 표현하고, 함수마저도 모두 메소드로 처리
//    자바의 메서드는 클래스 내부에만 선언이 가능
//    다른 메서드 안에서 선언할 수 없음. (중첩 함수 불가)


//리턴값이 없는 함수
static void makeLine(){ //void : 공허하다
    System.out.println("======================");
}

//    2개의 정수를 더해서 리턴하는 메서드
    static int add(int n1,int n2){
        return n1+n2;
    }

//    여러 값을 리턴하고 싶은 경우
//    2개 정수 전달하면 덧셈, 뺄셈, 곱셈 결과 리턴
    int[] operateAll(int n1,int n2){
        return new int[]{
                n1 + n2,
                n1 - n2,
                n1 * n2,
        };
        //1차원 배열 7개 리턴하려면 int[][] (2차원 배열로 묶어서 리턴)
    };

//    n개의 정수를 전달받아 총합을 리턴
    static int addAll(int... numbers){
        int total = 0;
        for(int n : numbers){
            total+=n;
        }
        return total;
    }

//    2개의 정수배열을 전달받아
//    들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드

//    static int[] compareNumbers(int[] arr){
//        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//    };


    public static void main(String[] args) {
        int result = add(10,20);
        makeLine();
        int r1 = addAll(1, 2, 3, 4, 5);
        System.out.println("r1 = "+r1);
    }
}
