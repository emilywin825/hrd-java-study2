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

    public void thunderBolt(){


    }
}
