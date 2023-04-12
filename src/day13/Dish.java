package day13;

public class Dish {
//    final 붙이고 초기화 안하면 오류
//    static final : 상수 만들려고 (유일성, 불변성)
//    static만 붙인 경우 : 모든 객체가 같은 값을 가짐
//    final만 붙인 경우 : 모든 객체가 다른 값을 가질 수 있지만 한번 정해지면 변경 x. / setter 못만듦
    private final String name; //요리 이름
    private final boolean vegeterian; //채식주의 여부
    private final int calories; //칼로리
    private final Type type; //요리 카테고리

    public enum Type{
        MEAT, FISH, OTHER
    }

//    final 붙였는데 어떻게 다 다르게 초기화해? -> 생성자 이용
    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
