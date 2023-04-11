package day10.collection.Map;

import day07.util.Utility;
import day10.collection.song.Artist;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // put(K, V) : 데이터 추가
        map.put("지갑잔액", 5000);
        map.put("좋아하는 가수", new Artist("동방신기", null));
        map.put("저녁메뉴", "볶음밥");

        System.out.println(map.size()); //3

        // get(key) : 데이터 참조
        String dinner = (String) map.get("저녁메뉴");
        System.out.println("dinner = " + dinner); //dinner = 볶음밥

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info();
        //가수명: 동방신기
//        노래 목록: null

        System.out.println(map); // {좋아하는 가수=day10.collection.song.Artist@1554909b, 지갑잔액=5000, 저녁메뉴=볶음밥}

        map.put("저녁메뉴", "짬뽕");
        System.out.println(map); // {좋아하는 가수=day10.collection.song.Artist@1554909b, 지갑잔액=5000, 저녁메뉴=짬뽕}

        // 반복문 처리
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
            Utility.makeLine();
//key = 좋아하는 가수
//value = day10.collection.song.Artist@1554909b
//=================================
//key = 지갑잔액
//value = 5000
//=================================
//key = 저녁메뉴
//value = 짬뽕
//=================================
        }
    }
}
