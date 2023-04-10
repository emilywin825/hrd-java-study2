package day11.api.obj;

import java.util.Objects;

public class Pen extends Object{
    Company company; // 제조 회사
    long serial; //시리얼 번호
    String color; //색상
    int price; //가격

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    //toString 재정의 -> 객체의 필드데이터를 빠르게 확인해볼 때 -> 많이 사용
    @Override
    public String toString() {
        return "Pen{" +
                "company="+company+
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    //equals 재정의 -> 시리얼 번호가 같으면 같은 객체로 보고 싶다. (중복 객체 확인하려고 할 때)
//    Pen p1 = new Pen(123, "빨강", 1000);
//    Pen p2 = new Pen(123, "빨강", 1000); 이렇게 두개가 정의되어 있으면 사실은 같은걸로 봐서 프로그래밍 하는 경우가 더 많음
//    이럴 때 중복 객체 확인하는 경우에
    //equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩 해라
    @Override
    public boolean equals(Pen this, Object obj) {
        if(obj instanceof Pen){ //obj 너 Pen의 타입이야?
            Pen target =(Pen) obj; //다운캐스팅
            return this.serial==target.serial && this.color.equals(target.color);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }
}
