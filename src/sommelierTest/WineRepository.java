package sommelierTest;

import day12.lamda.GenericPredicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WineRepository {

    private static Map<Integer,Wine> map;

    static {
        map=new HashMap();
        map.put(1, new Wine("aaa" ,"프랑스", "레드", 2.0, 12.0 ));
        map.put(2, new Wine("bbb" ,"프랑스", "레드", 2.0, 12.0 ));
        map.put(3, new Wine("ccc" ,"이탈리아", "화이트", 2.5, 12.0 ));
        map.put(4, new Wine("ddd" ,"이탈리아", "화이트", 10.0, 12.0 ));
        map.put(5, new Wine("eee" ,"어쩌고...", "화이트", 15, 12.0 ));
        map.put(6, new Wine("fff" ,"어쩌고...", "스파클링", 8, 12.0 ));
    }

    //필터링 기능
    public <T> List<T> wineList(Map<Integer,T> map, GenericPredicate<T> p){
        List<T> list=new ArrayList<>();
        for (T  t : map.values()) {
            if(p.test(t))
                list.add(t);
        }
        return list;
    }

    public int randomWine(){ //1~6까지 랜덤 수 출력
        int randonNum=(int)(Math.random() * (6)) + 1;
        return randonNum;
    }
}
