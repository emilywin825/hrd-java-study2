package day09.music;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;

public class MusicView {
    private final static MusicRepository musicRepository;

    static {
        musicRepository=new MusicRepository();
    }

    public void menuList(){
        while (true) {
            MusicRepository singerList = new MusicRepository();
            System.out.println("**** 음악 관리 프로그램 ****");
            System.out.printf("# 현재 등록된 가수 : %d명\n", musicRepository.SingerCount());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();
            menuNum();
        }
    }

    public void menuNum(){
        int menuNumber=Integer.parseInt(input(">>"));

        switch (menuNumber){
            case 1:
                insertProcess();
                break;
            case 2:
                searchProcess();
                break;
            case 3:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("다시 입력해 주세요");
        }
    }

    //1번 메뉴 기능
    private void insertProcess() {
        System.out.println("# 노래 등록을 시작합니다.");
        String singerName=input("-가수명 : ");
        String songName=input("-곡명 : ");
        if(musicRepository.findSingerName(singerName)){//가수명 있다면
            if(musicRepository.findSongName(songName)){ //노래도 있다면
                System.out.println("이미 있는 곡입니다.");
            }else{ //노래 없다면
                musicRepository.addSong(songName);
                System.out.println("# "+singerName+"의 노래목록에 '"+songName+"'곡이 추가되었습니다.");
                }
            }
        else{//가수명 없다면
            musicRepository.addSinger(singerName,songName);
            System.out.println("#아티스트 "+singerName+"이 신규 등록되었습니다.");
        }
    }

    //2번 메뉴 기능
    private void searchProcess() {
        System.out.println("# 검색할 가수명을 입력하세요.");
        String singerName=input("-가수명 : ");
        if(musicRepository.findSingerName(singerName)){ //가수 있다면
            System.out.printf("# %s님의 노래목록\n",singerName);
            makeLine();
            String[] songList = musicRepository.getSongList(singerName);
            for (int i = 0; i < songList.length; i++) {
                System.out.printf("* %d. %s\n",(i+1),songList[i]);
            }
        }else{ //가수 없다면
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }
    }
}
