package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수1: ");
            int n1=sc.nextInt(); //정수 미입력시 -> InputMismatchException

            System.out.print("정수2: ");
            String strN2=sc.next();
            int n2=Integer.parseInt(strN2); //정수 외의 값이 들어간 경우 -> NumberFormatException

            int result = n1/n2; //ArithmeticException
            System.out.println("result = "+result);
        } catch (InputMismatchException e) {
            System.out.println("첫번째 숫자는 정수로만 입력해주세요!");
        } catch (NumberFormatException e) {
            System.out.println("두번째 숫자는 정수로만 입력해주세요!");
        } catch (Exception e){ //종합보험 느낌 -> 위에서 안 잡힌 에러 여기서 다 캐치해서 예외처리
            System.out.println("알 수 없는 에러입니다. 관리자에게 문의하세요.");
        }
        
        System.out.println("프로그램이 정상 종료");

        sc.close();

    }
}
