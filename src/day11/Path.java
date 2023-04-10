package day11;

public interface Path {
    //인터페이스는 필드를 못가지, 모든 변수가 상수화
    //자동으로 static final이 붙음
    String ROOT_PATH = "D:/exercise";
    String MEMBER_SAVE_PATH=ROOT_PATH+"/member";
}
