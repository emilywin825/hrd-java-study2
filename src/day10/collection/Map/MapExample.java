//package day10.collection.Map;
//
//import day07.util.Utility;
//
//import java.util.Arrays;
//import java.util.HashMap;
//
//import static day07.util.Utility.makeLine;
//
//public class MapExample {
//    public static void main(String[] args) {
//        //       키  ,   value   -> 키 : 보통 String 많이 사용
//        HashMap<String, Object> map = new HashMap<>(); //현업에서 가장 많이 사용하는 구조
////        HashMap<Object, List<Artist>> maps = new HashMap<>();
//
//        //put(K,V) : 데이터 추가
//        map.put("지갑잔액",5000);
//        map.put("좋아하는 가수", new Artist("동방신기",null));
//        map.put"저녁메뉴", "볶음밥");
//        System.out.println(map.size());
//
//        //get(key) : 데이터 참조
//        Object dinner = map.get("저녁메뉴");
//        System.out.println("dinner = "+dinner);
//
//        Arrays artist=(Artist)map.get("좋아하는 가수");
//        artist.info(mpa);
//
//
//        Map.put("저녁메뉴","짬뽕");
//        System.out.println(map);
//
//
//        //본복문 처리 -> iter 사용 x
//        for(String key : map.keySet()){
//            System.out.println("key = "+key);
//            System.out.println("vlaue ="+map.get(key));
//            makeLine();
//
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
