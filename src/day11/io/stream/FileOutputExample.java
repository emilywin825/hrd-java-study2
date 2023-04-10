package day11.io.stream;

import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) {
        String msg="멍멍이는~~~ 왈왈~ \n하하호호";
        //데이터를 외부로 내보낼 때 출력스트림 : OutputStream -> 추상클래스이므로 new로 객체 생성 불가. 
        //이거 상속받은 자식 클래스 가져다가 구현해야하는데 그게 FileOutputStream
        try(FileOutputStream fos
                    = new FileOutputStream("D:/exercise/dog.txt")) {
            fos.write(msg.getBytes());//바이트스트림은 모든걸 바이트로 변경해서 내보내는데 String을 바이트로 바꿔주는게 getBytes();
            System.out.println("파일 저장에 성공!");
        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다.");
        } catch (IOException e){
            System.out.println("출력시스템에 문제가 생김");
        }


        //밑에처럼 닫을 때 마다 다 예외 처리하기 불편 -> 그래서 try()문 안에서 선언하면 auto closing 해줌
//        finally {
//            try {
//                if(fos != null) fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
