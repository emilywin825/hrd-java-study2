package day06.encap;

public class Car {
//getter, setter의 주 목적 : 원하는 값만 셋팅할 수 있도록 하는것
//  필드의 접근은 막아줘야 하므로(정보 은닉의 기본) private!!!! -> getter, setter로 접근하도록 관례화 됨
    private String model; //모델명 -> 모델명은 다 달라질 수 있는거 아니야?? 왜 private로 하는거야?? -> 그렇게 관례화 됨. -> 코들린에서는 getter, setter 없앰.

    private int speed; //현재 속도

    private char mode; //변속 모드 (D,N,R,P)
    
    private boolean start; //시동 온오프 상태

    //모델명은 차마다 다르게 탄생됨
    //생성자 : 객체가 처음 생성될 때 상태를 표시
    public Car(String model){
        this.model=model;
        this.mode='P';
        //밑의 둘은 선언 안해도 초기값이 각각 0, false 이므로 안적음.
//        this.speed=0;
//        this.start=false;
    }
        //setter : 필드값을 제어하기 위한 메서드 -> setter를 이용해서 값 변경
        public void setSpeed(int speed) {
            if(speed<0 || speed>200) return;
            this.speed=speed;
    }

    //getter : 필드값을 참조하기 위한 메서드
    public  int getSpeed(){
        //필드에는 Km로 저장되어 있는데
        //mile로 변환해줘야 하면 여기서 변경.
        //값 변경해서 줘야 한다면 getter에서 변경해서 주면 됨
        return this.speed;
    }

    //만약 모델명 변경 안하도록 하고싶으면 setter 안만들면 됨
    public String getModel() {
        return model;
    }

//    public void setModel(String model) {
//        this.model = model;
//    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D': case 'R': case 'N': case 'P':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }

    //엔진에 연로가 주입되는 기능
    private void inject(){
        System.out.println("연료가 주입됩니다.");
    }
    //엔진오일이 순환하는 기능
    private void putOil(){
        System.out.println("엔진오일이 순환합니다." +
                "");
    }

    //엔진 실린더가 움직이는 기능
    private void moveCylinder(){
        if(start){
            System.out.println("실린더가 움직입니다.");
        } else{
            System.out.println("차가 폭발합니다.");
        }
    }
    //시동버튼을 누르는 기능
    public void pressButton(){
        this.start=true;
        //순서를 내부적으로 정해놈 -> 외부에서 순서를 변경할 수 없겠죠!! 좋겠죠!!
        inject();
        putOil();
        moveCylinder();
        System.out.println("시동이 걸렸습니다.");
    }



}
