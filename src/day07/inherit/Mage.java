package day07.inherit;

public class Mage extends Player {


    int mana; //마력 게이지

    public Mage(String nickName) {
        this.nickName = nickName;
        this.level=1;
        this.hp=50;
        this.mana=100;
    }

    @Override
    public void showStatus() {
        System.out.println("\n======== Character's Info ========");
        System.out.println("# name : "+this.nickName);
        System.out.println("# level : "+this.level);
        System.out.println("# hp : "+this.hp);
        System.out.println("# mana : "+this.mana);
    }

    public void thunderBolt(Player ... targets){

        for (Player p : targets) {

            //맞은게 나면 skip
            if(p==this) continue;

            //10 ~ 15의 랜덤 피해
            int damage=  (int) (Math.random() * 6 + 10);

            //실제 체력에서 차감
            p.hp-=damage;
            System.out.println(p.nickName+"님이 "+damage+"의 피해를 입었습니다.(남은 체력: "+ p.hp+")");
        }

        


    }
}
