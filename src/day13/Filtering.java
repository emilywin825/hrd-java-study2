package day13;

import java.util.List;
import java.util.function.Consumer;

import static day07.util.Utility.makeLine;
import static day13.Dish.Type.MEAT;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {
        //stream의 filter
        //필터조건에 맞는 데이터들을 필터링

        //메뉴목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요.
        //원래 한다고 하면
//        List<Dish> vegeList=new ArrayList<>();
//        for (Dish dish : menuList) { ... }

//
        List<Dish> filteredList = menuList.stream()
                .filter(dish -> dish.isVegeterian()) //dish->dish.isVegeterian() = Dish::isVegeterian
                .collect(toList());

        System.out.println("===== 채식주의자 식용 요리 목록 =====");
//        for (Dish dish : filteredList) {
//            System.out.println(dish);
//        }

//        filteredList.forEach(new Consumer<Dish>() {
//            @Override
//            public void accept(Dish dish) {
//                System.out.println(dish);
//            }
//        });
        filteredList.forEach(dish -> System.out.println(dish));

        //메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링해서 출력
        makeLine();
        menuList.stream()
                .filter(d -> d.getType() == MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        //메뉴 목록에서 요리의 이름이 4글자인 요리들만 필터링해서 출력
        makeLine();
        System.out.println("<메뉴 목록에서 요리의 이름이 4글자인 요리들만 필터링해서 출력>");
        menuList.stream()
                .filter(d -> d.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        //원하는 개수만 필터링하기
        //칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        makeLine();
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) //제한 걸어 -> 정렬 걸어놓고(ex. 높은 순으로) 쓰면 더 좋음
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();
        //칼로리가 300칼로리보다 높은 요리 중 처음 2개는 제끼고 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) //맨앞 2개 제외
                .limit(3)//하고 3개
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();
        //메뉴 목록에서 처음 등장하는 2개의 고기요리를 필터링해서 리스트에 반환
        List<Dish> meatList = menuList.stream()
                .filter(d -> d.getType() == MEAT)
                .limit(2)
                .collect(toList());
        meatList.forEach(d-> System.out.println(d));

        makeLine();
        List<Integer> distinctedList = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);
        //리스트에서 중복 제거하기
        distinctedList.stream()
                .distinct() //중복제거
                .collect(toList());
        System.out.println("distinctedList=" + distinctedList);
        
    }
}

