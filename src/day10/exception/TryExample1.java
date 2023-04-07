package day10.exception;

public class TryExample1 {
    public static void main(String[] args) {
        int n1=10, n2=2;

        System.out.println("나눗셈 시작!"); //너무 간단하니까 예외 날 확률 x -> 예외 처리 x

//        String s=null;
//        s.length(); //100% 에러 -> 예외 처리 x (그냥 지워야지)

        try {
            // 예외 발생 가능성이 있는 코드 <- 예외처리 o
            System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
        } catch (Exception e) { //예외가 발생하면 처리할 코드
            System.out.println("0으로 나눌 수 없습니다."); //에러 나면 이거 찍고 밑에꺼 실행
            //개발시에 쓰는 코드 (로그 트레이싱)
            e.printStackTrace(); //이거 작성하면 에러 로그 찍어줌
        }
        System.out.println("프로그램 정상 종료");
    }
}
