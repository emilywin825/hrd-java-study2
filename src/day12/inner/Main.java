package day12.inner;

public class Main {
    public static class SubCalculator{
        private static int operate(int n1,int n2){
            return n1-n2;
        }
}

    public static void main(String[] args) {
//뺄셈 계산을 하는 계산기를 다른 패키지에서도 불러다 써야한다면 구현체 만드는게 맞지만
// 여기 Main에서만 쓸거면 파일만들기 귀찮고 싫을 떄 -> 내부 클래스


        //인터페이스 사용하려면 인터페이를 이용해 클래스를 구체화시키고 사용해야 함
        //new Calculator -> 바로 이렇게는 불가
        //덧셈 계산을 하는 계산기를 만들어 쓰고 싶다.
        AddCalculator addCal = new AddCalculator();
        System.out.println(addCal.operate(30,50));
        
//      뺄셈 계산을         SubCalculator sub1 = new SubCalculator();
//        System.out.println(sub1.operate(100,40));하는 계산기 필요


//  곱셈 계산을 하는 계산기 필요(익명 클래스 -> 내부 클래스보다 더 빨리 클래스 만들 순 없을까?/ 일회용)
            Calculator multiCal=new Calculator(){ //new Calculator() 뒤에 class MultiCalculator implements Calculator 이거 붙여야 하지만 
                                                  // 일회용이므로 이름 필요없고 인터페이스 구현한거 다 아니까 안씀
                //필드 선언 가능
                private String name;

                @Override
                public int operate(int n1, int n2) {
                    return n1*n2;
                }
        };
        System.out.println(multiCal.operate(5,7));

        //나눗셈을 하는 계산기(람다) : 인터페이스의 추상메서드 딱 1개일 때 만 사용 가능 2개 이상은 익명클래스로 사용해야 함
        //람다 : 메소드가 하나인 익명클래스의 간단한 표현방법
        Calculator divCal=(n1, n2) -> n1/n2;
        System.out.println(divCal.operate(50,10));
        //자바는 함수라는 개념이 없어서 일급함수 사용 x -> 함수에 함수 전달 불가
        
        //1회용 강아지
        Pet dog=new Pet(){//익명 함수 2개이므로 람다 불가 -> 익명 클래스 사용

            @Override
            public void eat() {
                System.out.println("강아지는 개사료를 먹어요");
            }

            @Override
            public void play() {
                System.out.println("강아지는 마당에서 놀아요");
            }
        };
        dog.eat();
        dog.play();
    }
}
