package day11.io.objstream;

import day11.Path;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveSnack {
    private static List<Snack> snackList=new ArrayList<>(); //List는 직력화(ㅇ), Snack이 직렬화안되어 있음

    public static void main(String[] args) {
        snackList.add(new Snack("콘칲", 1970, 1500, Snack.Taste.GOOD));
        snackList.add(new Snack("사브레", 1990, 1500, Snack.Taste.BAD));
        snackList.add(new Snack("짱구", 1985, 1500, Snack.Taste.SOSO));
    }
    //객체를 통채로 파일에 저장 -> byte 형태로 저장할 수 없을까?
    private static void saveFile(){
        try(FileOutputStream fos
                    =new FileOutputStream(Path.ROOT_PATH+"/snack.sav")){

            //객체 저장을 위한 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList); //이렇게 하면 바로 저장됨


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }





    //텍스트파일로 리스트 데이터 저장
    private static void saveTextFile(){
        try(FileWriter fw = new FileWriter(Path.ROOT_PATH+"/snack.txt")) {
            for (Snack s : snackList) {
                fw.write(String.format("%s, %d, %d, $s\r\n",s.getSnackName()
                                                    ,s.getYear(), s.getPrice()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
