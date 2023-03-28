package day01;

public class Scope {
    public static void main(String[] args) {

        int userNumber = 1010;

        //자바는 블록단위 스코프를 가짐
        int n1 = 10;
        int n2 = 20; // main 블록에서 생성된 변수

        if(true){
            int n3 = n1 + n2;
        } //end if -> main 안 끝났으므로 n1,n2 사용 가능
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

    }//end main -> n1,n2는 이 블록 나가면 죽음
}
