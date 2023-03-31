package day04;

//실행용 클래스
//여기엔 설계를 하지 않고 main 메서드를 작성
public class DancerMain {
    public static void main(String[] args) {

        // 들어있는거 너무 많아서 변수에 넣을 수 없어서 new 이용해서 heap 공간빌림
         Dancer kim = new Dancer(); //kim은 Dancer 객체의 주소값이 저장되어 있음
         Dancer park = new Dancer("걸스힙합");
         Dancer jang = new Dancer("장동건","왁킹",DanceLevel.PRO);

         Singer song=new Singer();

        System.out.println(kim); //day04.Dancer@58ceff1
        System.out.println(park); //day04.Dancer@7c30a502
        System.out.println(jang);

        kim.dance();
        park.dance();
        jang.dance();

//        kim.dancerName="김관종";
//        kim.crewName="서커스크루"; -> 내가 대입 하는거 아님. 생성자 이용

        System.out.println(kim.introduce()); //내이름은 갑돌이이고, 돌아이들팀에 소속되어 있습니다.

    }



}
