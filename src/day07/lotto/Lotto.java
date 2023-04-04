package day07.lotto;

import java.util.Arrays;

public class Lotto {

    static int[] lottoNum=new int[6];
     static int[] information(){ //로또번호 랜덤으로 6개 (1 ~ 45)

         int i=0;
         while (i < lottoNum.length){

             int randomNum= (int) ((Math.random() * 45)+1);

             if( isDup(randomNum,i) ){
                 lottoNum[i]=randomNum;
                 i++;
             }
         }

        //배열 올림차순 정렬
        Arrays.sort(lottoNum);
//        System.out.println(Arrays.toString(lottoNum));
        return lottoNum;
    }

    //중복 검사 함수
    static boolean isDup(int randomNum,int i){
        for (int j = 0; j < i; j++) {
            if(lottoNum[j]==randomNum){
                return false;
            }
        }
        return true;
    }

}
