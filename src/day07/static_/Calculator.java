package day07.static_;

//그래서 static 붙이고 안붙이고는 언제하는지??
public class Calculator {
    String color; //계산기 색깔 -> 색깔은 다 다르므로 공유x
    static double pi; //원주율 -> 원주율은 다 똑간은데 왜 메모리에 여러개 만들어?? 다 돌려쓰면 됨

    //원의 넓이를 구하는 메서드
    static double calcAreaCircle(int r) {
        return pi * r * r;
    }

    // 계산기에 색칠을 예쁘게 칠하는 기능
    void paint(String color){
        this.color=color;
    }
}
