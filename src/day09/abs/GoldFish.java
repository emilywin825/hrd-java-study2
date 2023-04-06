package day09.abs;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    //밑에 두개 메소드 안 쓰면 오류남
    @Override
    public void takeNap() {
        
    }

    @Override
    public void eat() {

    }
}
