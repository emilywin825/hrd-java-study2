package day09.music;

import day04.array.StringList;
import day07.protec.pac1.A;

import java.util.Arrays;

import static day07.util.Utility.makeLine;

public class MusicRepository {

    private static Singer[] songArr;
    private Singer singer;

    static {
        songArr=new Singer[0];
    }

    public int SingerCount(){
        return songArr.length;
    }
    public String[] getSongList(String singerName) {
        for (Singer singer : songArr) {
            if (singer.getSingerName().equals(singerName)) {
                return singer.getSongName().getsArr();
            }
        }
            return null;
        }

    //가수명 있는지 판단
    public boolean findSingerName(String singerName){
        for (Singer singer : songArr) {
            if (singer.getSingerName().equals(singerName)) {
                return true;
            }
        }
        return false;
    }
//곡명있는지 판단
    public boolean findSongName(String songName) {
        singer = new Singer();
        String[] songList = singer.getSongName().getsArr();
        for (String song : songList) {
            if (song.equals(songName)) {
                return true;
            }
        }
        return false;
    }
    //노래 추가
    public void addSong(String songName){
        singer = new Singer();
        singer.getSongName().push(songName);
    }

    //가수+곡명 추가
    public void addSinger(String singerName,String songName){
        singer = new Singer(singerName, new StringList(songName)); //아래 코드(1~4) 이 코드 한줄로 대체 가능 (생성자 이용)
        //  Singer singer = new Singer();               //1. 객체 생성
        //  singer.setSingerName(singerName);           // 2. 생성된 가수 객체에 전달받은 이름 셋팅
        //  singer.setSongName(new StringList());      // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
        //  singer.getSongName().push(songName);      // 4. 해당 노래목록에 전달받은 노래 추가

        Singer[] temp=new Singer[songArr.length+1];
        for (int i = 0; i < songArr.length; i++) {
            temp[i]=songArr[i];
        }
        temp[songArr.length]=singer;
        songArr=temp;
    }
}
