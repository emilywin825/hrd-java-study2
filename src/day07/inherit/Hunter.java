package day07.inherit;

public class Hunter extends Player {


    int concentration; //집중력

    public Hunter(String nickName) {
        this.nickName = nickName;
        this.level=1;
        this.hp=50;
        this.concentration=100;
    }

    @Override
    public void showStatus() {
        System.out.println("\n======== Character's Info ========");
        System.out.println("# name : "+this.nickName);
        System.out.println("# level : "+this.level);
        System.out.println("# hp : "+this.hp);
        System.out.println("# concentration : "+this.concentration);
    }

    public void Beast(){

    }
}
