package day05.player;

public class Player {

    String nickName; //캐릭터 닉네임
    int level; //레벨
    int hp; //체력

    //생성자
    public Player() {
        this("이름없음"); //다른 생성자 호출
        System.out.println("1번 생성자 호출!");
//      this.nickName = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }

    public Player(String nickName) {
        System.out.println("2번 생성자 호출!");
//      지역변수에는 this 못 붙임. 필드에만 붙일 수 있음
        this.nickName = nickName; //this.nickName -> 필드 //this가 가지는 주소값은 이 생성자를 부른 객체의 주소값
        this.level = 1;
        this.hp = 50;
    }

    void levelUp(Player this) {

    }

    //기능 - 메서드
    void attack(Player target) { //원래 이렇게 되어있음. void attack(Player this,Player target)->Player this는 숨어(?)있음
        //여기 this는 attack을 호출한 주체 (ex. parking.attack(gondue) 이렇게 호출하면 Player.this에는 parking의 주소 들어감 )
        //내가 날 때리지 못하게 타겟이 나면 return
        if (this == target) return;

        System.out.println("target의 주소 : " + target);
        System.out.println("this의 주소 : " + this);

        //맞은 녀석의 체력을 10~15 랜덤으로 감소시킬거임
        int damage = (int) (Math.random() * 6 + 10);

        target.hp -= damage;
        //전투로그 출력할 거임
        //가해자가 피해자를 공격해서 10의 피해를 입힘
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘\n", this.nickName, target.nickName, damage);

    }
}
