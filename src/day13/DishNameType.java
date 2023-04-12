package day13;

//요리 정보 중에 이름과 칼로리만 관리하는 객체
public class DishNameType {
    private final String name;
    private final Dish.Type Type;

    public DishNameType(Dish dish) {
        this.name = dish.getName();
        Type = dish.getType();
    }

    @Override
    public String toString() {
        return "DishNameType{" +
                "name='" + name + '\'' +
                ", Type=" + Type +
                '}';
    }
}
