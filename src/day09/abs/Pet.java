package day09.abs;

//추상화 : 주의사항
//1. 객체 생성 불가
//2. 메서드는 오버라이딩을 위한 껍데기 역할에 국한되도록 제한
//어짜피 new pet() 안쓸건데, 오버라이딩을 위한 메서드는 안에 내용 없이 껍데기만 있는건데(껍데기만 가져다가 자식들이 채우니까) 이 생각때문에 추상 개념이 등장



public abstract class Pet {
    private String name; //이름
    private String kind; //종
    private int age; //나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //오버라이딩을 위한 메서드
    //클래스가 추상이 아니면 추상 메서드 선언 불가
    //추상 메소드 {} 불가
    // 이 기능을 필수적으로 만들어야함(강제 오버라이딩 강요)
    public abstract void takeNap();
    public abstract void eat();

    //추상 클래스 내부에 일반 메소드 선언 가능
    //선택 기능
    public void walk(){
        System.out.println("애완동물은 산책을 합니다.");
    }
}
