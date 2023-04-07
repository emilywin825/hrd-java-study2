package day10.generic;

public class Basket<F> { //F이거는 아무거나 써도 됨 -> 생성자 만들 때 결정하는게 들어오기 때문에

    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}

