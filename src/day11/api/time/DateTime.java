package day11.api.time;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.time.LocalDate.*;

public class DateTime {

    public static void main(String[] args) {
//        Date date=new Date();
//        date.getTime();
//        Calendar calendar=Calendar.getInstance();
//        calendar.get(Calendar.MONTH);

        //현재 날짜 정보 얻기(연,월,일)
        LocalDate nowDate= now();
        System.out.println("nowDate = "+ nowDate); //nowDate = 2023-04-10

        //시,분,초
        LocalTime nowTime=LocalTime.now();
        System.out.println("nowTime = "+nowTime); //nowTime = 11:35:11.366914600

        //연월일시분초
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = "+nowDateTime); //nowDateTime = 2023-04-10T11:35:11.366914600

        //원하는 날짜정보만 얻기
        int year=nowDateTime.getYear();
        System.out.println("year = "+year); //year = 2023

        //특정 날짜 만들기
        LocalDateTime targetDate= LocalDateTime.of(2023,5,19,5,0,0);
        System.out.println("LocalDateTime"+targetDate); //LocalDateTime2023-05-19T05:00s
        
        //날짜 연산
        //도서 대여 시스템 빌린 날짜로부터 3일 후가 반납일
        LocalDateTime rentalDate=LocalDateTime.now();
        LocalDateTime returnDate = rentalDate.plusDays(3);
        System.out.println("returnDate = "+returnDate); //returnDate = 2023-04-13T11:35:11.371905600

        LocalDateTime targetDateTime= rentalDate.plusYears(1)
                                        .plusMonths(2)
                                        .plusDays(10)
                                        .plusHours(5);

        //사이 날짜 구하기
         LocalDate b=LocalDate.of(2019,12,28);
         LocalDate d=LocalDate.of(2023,3,10);
        long between=ChronoUnit.DAYS.between(b,d);
        System.out.println("between = "+between); //between = 1168
        
        //날짜 포맷 바꾸기
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");

        String dateString=nowDateTime.format(pattern);
        System.out.println("dateString = "+ dateString); //dateString = 2023년 04월 10일 월요일 오전 11시 35분
    }
}
