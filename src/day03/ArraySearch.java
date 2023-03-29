package day03;

public class ArraySearch {


    public static int indexOf(String target) {
        String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
        foods[2]="치킨";
        //인덱스 탐색 알고리즘
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int index=indexOf("치킨");
        System.out.println("찾은 인덱스 : " + index);

    }
}
