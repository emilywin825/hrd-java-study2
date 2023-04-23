package day13.practice;

import java.util.List;

import static day07.util.Utility.makeLine;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class MainTeacher {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> tr2021 = transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(comparing(t -> t.getValue()))
                .collect(toList());
        tr2021.forEach(tr -> out.println(tr));
/*  {Trader: Brian in Cambridge, year: 2021, value: 300}
    {Trader: Raoul in Cambridge, year: 2021, value: 400}
    {Trader: Mario in Milan, year: 2021, value: 710}
* */

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        // 거래목록에서 거래자들을 추출한담에 거래자안에 있는 도시이름을 추출
        // filter :  10개중에 조건에 맞는 3개를 필터링
        // map :  10개중에 10개를 가져오는데 조건에 맞게 추출
        makeLine();
        List<String> cities = transactions.stream()
                .map(tr -> tr.getTrader().getCity())
                .distinct()
                .collect(toList());
        out.println("cities = " + cities);
//        cities = [Cambridge, Milan]

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        makeLine();
        List<Trader> tradersFromCamb = transactions.stream()
                .map(tr -> tr.getTrader())
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing((Trader t) -> t.getName()))
                .collect(toList());

        tradersFromCamb.forEach(out::println);
/*Trader: Alan in Cambridge
Trader: Brian in Cambridge
Trader: Raoul in Cambridge*/

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        makeLine();
        List<String> traderNames = transactions.stream()
                .map(tr -> tr.getTrader().getName())
                .distinct()
                .sorted() // 정렬대상이 문자열이나 숫자면 comparing 안 써도됨
                .collect(toList());

        out.println("traderNames = " + traderNames);
//traderNames = [Alan, Brian, Mario, Raoul]

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        makeLine();
        boolean flag1 = transactions.stream()
                .anyMatch(tr ->
                        tr.getTrader()
                                .getCity()
                                .equalsIgnoreCase("milan"));

        out.println("flag1 = " + flag1);
//flag1 = true

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        makeLine();
        int totalTransactionValue = transactions.stream()
                .filter(tr -> tr.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .mapToInt(tr -> tr.getValue())
                .sum();
        out.println("totalTransactionValue = " + totalTransactionValue);
//        totalTransactionValue = 2650

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        makeLine();
        List<Integer> values = transactions.stream()
                .map(tr -> tr.getValue())
                .sorted(comparing((Integer n) -> n).reversed())
                .collect(toList());
        makeLine();
        int maxValue = transactions.stream()
                .mapToInt(tr -> tr.getValue())
                .max()
                .getAsInt();
        out.println("maxValue = " + maxValue);
//        maxValue = 1000

        out.println("values = " + values.get(0));
//        values = 1000

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        makeLine();
        List<Transaction> transactionList = transactions.stream()
                .sorted(comparing(tr -> tr.getValue()))
                .collect(toList());
        makeLine();
        Transaction minValueTransaction = transactionList.get(0);
        out.println("transactionList.get(0) = " + minValueTransaction);
//transactionList.get(0) = {Trader: Brian in Cambridge, year: 2021, value: 300}

        Transaction minTr = transactions.stream()
                .min(comparing(tr -> tr.getValue()))
                .get();
        out.println("minTr = " + minTr);
//        minTr = {Trader: Brian in Cambridge, year: 2021, value: 300}
    }
}