package day10.exception;

public class FinallyExample {
    public static void main(String[] args) {
        String[] pets = {"비둘기", "거북이", "앵무새"};

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(pets[i] + "키울래요~");

            }
        } catch (Exception e) {
            System.out.println("애완동물 정보가 없습니다~");
        } finally{
            //예외 발생하던 안 하던 항상 실행할 코드
            System.out.println("애완동물 조아용~");

            //데이터베이스 접속 후 다음 접속을 위해
            //데이터베이스 연결을 종료시켜야 할 경운
        }
        System.out.println("프로그램 정상 종료!");
    }
}
