package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        String member;
        int index=-1;

        Loop:
        while (true) {
            System.out.print("-수정할 멤버의 이름을 입력하세요.\n>>");
            member = sc.next();
            for (int i = 0; i < tvxq.length; i++) {
                if (member.equals(tvxq[i]))
                    break Loop;
            }
            System.out.println("!이름을 잘못 입력하셨습니다.!");
        }

        System.out.print(tvxq[index] + "의 별명을 변경합니다.\n>>");
        String nickname = sc.next();
        tvxq[index] = nickname;
        System.out.println("변경완료!!\n* 변경 후 정보: " + Arrays.toString(tvxq));

        sc.close();
    }
}

//강사님 답
/*        

            while (true) {
                System.out.println("- 수정할 멤버의 이름을 입력하세요.");
                System.out.printf(">> ");
                String targetName = sc.next();

                //탐색 알고리즘
                int index = -1;
                for (int i = 0; i < tvxq.length; i++) {
        if (targetName.equals(tvxq[i])) {
        index = i;
        break;
        }
        }

        //수정 여부 판단
        if (index > -1) {
        System.out.printf("%s의 별명을 변경합니다.\n", targetName);
        System.out.printf(">> ");
        String newName = sc.next();
        tvxq[index] = newName;
        System.out.println("변경 완료!!");
        System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
        break;
        } else {
        System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
        }
        } //end while
        sc.close();
        }*/
