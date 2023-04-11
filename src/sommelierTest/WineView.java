package sommelierTest;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;

public class WineView {
    public void view(){
        System.out.println("1번 : 와인 추천 받기");
        int num= Integer.parseInt(input("원하시는 번호 입력 : "));

        switch (num){
            case 1:
                wineFiltering();
                break;

        }
    }

    public void wineFiltering(){
        makeLine();
        int num= Integer.parseInt(input("필터링 원하는 종류 선택\n1. 와인 종류  2. 국가  3. 가격 -> "));
        WineRepository wineRepository = new WineRepository();
        switch (num){
            case 1:
                int type= Integer.parseInt(input("1. 레드 2. 화이트 3. 스파클링 -> "));
//                wineRepository.wineList();
                break;
            case 2:
                int country= Integer.parseInt(input("1. 이탈리아 2. 프랑스 3. 어쩌고... -> "));
                break;
            case 3:
                int price= Integer.parseInt(input("1. 2만원~5만원 2. 5만원~10만원 3. 10만원~20만원 -> "));
                break;
        }
    }




}
