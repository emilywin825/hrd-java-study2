package day10.friends;


import java.util.ArrayList;
import java.util.List;

//한명의 사람
public class People {

    private String nickName; //닉네임

    //팔로워 목록
    private List<People> followers;

    //팔로워 대기목록
    private List<People> followerWaitList;

    //팔로잉 목록
    private List<People> followings;

    //생성자
    public People(String nickName) {
        this.nickName = nickName;
        //팔로우, 팔로잉은 처음에는 0으로 시작하므로
        this.followers=new ArrayList<>();
        this.followings=new ArrayList<>();
        this.followerWaitList=new ArrayList<>();
    }

    public void addFollowerWaitList(People requestPerson){
    //팔로워 대기목록에 팔로우 요청한 사람을 추가하는 기능
        this.followerWaitList.add(requestPerson);
    }
    
    //팔로워 목록에 팔로우 수락한 사람을 추가하는 기능
    public void addFollower(People requestPerson){
        //팔로워 목록에 추가하고
        this.followers.add(requestPerson);
        //대기 리스트에서는 빼주기
        this.followerWaitList.remove(requestPerson);
        //상대방의 팔로잉 목록에 나 추가
        requestPerson.followings.add(this);
    }

    //팔로워 대기목록에서 닉네임들을 보여주는 기능
    public List<String> showFollowerWaitPerson(){
        //팔로워대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitListNames = new ArrayList<>();
        for (People people : followerWaitList) {
            waitListNames.add(people.nickName);
        }
        return waitListNames;
    }

    //팔로워 목록에서 닉네임들을 보여주는 기능
    public List<String> showFollower(){
        //팔로워대기목록 사람들 닉네임만 저장할 리스트
        List<String> waitListNames = new ArrayList<>();
        for (People people : followers) {
            waitListNames.add(people.nickName);
        }
        return waitListNames;
    }





























}
