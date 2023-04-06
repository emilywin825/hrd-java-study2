package day09.music;

import day04.array.StringList;

public class Singer {

    private String singerName;
    private StringList songList;

    public Singer(){

    }

    public Singer(String singerName, StringList songName) {
        this.singerName = singerName;
        this.songList = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public StringList getSongName() {
        return songList;
    }

    public void setSongName(StringList songList) {
        this.songList=songList;
    }
    
    //가수의 정보를 출력하는 기능
    public void info(){
        System.out.println("가수명 : "+this.songList);
        System.out.println("노래 목록 : "+ this.songList);
    }
}
