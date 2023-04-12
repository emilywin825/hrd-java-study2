package day13.comparator;

import day06.modi.pac2.C;
import day13.SimpleDish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static day07.util.Utility.makeLine;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("홍철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );


//        나이 순으로 오름차 정렬(나이 적은수)
        studentList.sort((o1, o2) -> o1.getAge()-o2.getAge());
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        studentList.forEach(s-> System.out.println(s));
        studentList.forEach(s-> System.out.println(s));

        makeLine();
        System.out.println("< 이름 가나다순으로 오름차정렬 >");
        //이름 가나다순으로 오름차정렬
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        studentList.forEach(s-> System.out.println(s));






    }
}
