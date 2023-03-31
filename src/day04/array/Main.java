package day04.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList foodList = new StringList();
//        StringList foodList = new StringList("꿔바로우");
        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");
        
        StringList userNameList = new StringList();
        userNameList.push("김동혁");
        userNameList.push("김지원");

        foodList.pop();
        userNameList.pop();

        System.out.println("foodList ="+foodList);
        System.out.println("foodList.size() = "+foodList.size());

        System.out.println("userNameList ="+userNameList);
        System.out.println("userNameList.size() = "+userNameList.size());

        System.out.println("foodList 비었니?"+foodList.isEmpty());
        foodList.clear();
    }
}
