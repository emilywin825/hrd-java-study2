package day08.poly.book;

import day07.protec.pac1.B;

public class CartoonBook extends Book{
    private int accessAge; //나이 제한

    public CartoonBook() {}

    public CartoonBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher); //부모 생성자 이용해 초기화
        this.accessAge = accessAge; //내껀 내가
    }

    //부모꺼 상속받았으니까 내꺼 getter/setter만 만들면 ㅇㅇ
    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String info() {
        return String.format("# 분류 : 만화책, %s 연령제한 : %d세", super.info(), accessAge);
    }

    public void checkAge(int age){
        ;
    }
}
