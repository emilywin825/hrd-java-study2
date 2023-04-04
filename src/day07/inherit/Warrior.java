package day07.inherit;


//서브 클래스 (자식 클래스)
public class Warrior extends Player{

    int rage; //분노게이지


    public Warrior(String nickName){
        super(nickName);
//      this(nickName); // this나 super 둘 중 하나만 쓸 수 있음 -> 둘 다 첫번째 구문에 나와야 하므로
//      만약 this(nickName)을 살리면 super()는 죽는거

        this.nickName=nickName; //원래는 super.nickName=nickName;이 맞는거 부모의 nickName이니까. JVM이 알아서 판단해서 해주는거지 이게 맞는게 아님
        this.level=1;
        this.hp=50;
        this.rage=20;
    }

    //캐릭터 상태창을 보는 기능

    public void powerSlash(){
        System.out.println("파워슬레시를 어쩌고저쩌고");
    }

    //오버라이딩
    //조건 : 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    //접근 제한자는 무조건 부모보다 public 해야 함(더 약하게는 가능. 더 강하게는 불가)
    @Override //정확하게 오버라이딩 했는지 검사
    public void showStatus(){
        super.showStatus();
//        this.showStatus(); 이건 무한루프. 나를 계속 부르는거.
        System.out.println("# rage : "+this.rage);

    }
}
