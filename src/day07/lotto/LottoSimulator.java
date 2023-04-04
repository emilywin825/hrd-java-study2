package day07.lotto;

import day07.util.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class LottoSimulator {
    static void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("구매번호를 6개 차례대로 입력하세요.");

        int[] lottoNum = new int[6];
        for (int i = 0; i < 6; i++) {
            lottoNum[i]= Integer.parseInt(Utility.input((i+1)+"번째 번호>>"));
        }
        //오름차순 정렬
                Arrays.sort(lottoNum);



        int  numberOfPur=1;
        while(true){

            int[] a = Lotto.information(); //받아온 로또 번호 배열
            System.out.println(Arrays.toString(a));
            int correct=0;
//            if(Arrays.toString(a).equals(Arrays.toString(lottoNum))) break;

            for (int i = 0; i <6; i++) {
                if(a[i]==lottoNum[i]) correct++;
            }
            if(correct==6) break;
            else{
                System.out.println(numberOfPur+"장째 구매중..ㅠㅠ");
                numberOfPur++;
            }
        }
        System.out.println(numberOfPur+"장만에 1등에 당첨되었습니다.ㅊㅋㅊㅋ");
        System.out.println((numberOfPur*1000)+"원을 사용하셨습니다.");

    }

}
