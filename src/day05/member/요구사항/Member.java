package day05.member.요구사항;

import java.time.LocalDate;

public class Member {
    public LocalDate regDate; //회원가입 시간
    String email;
    String password;
    String memberName;
    int memberId;
    Gender gender;
    int age;


    public Member(String email, String password, String memberName, int memberId, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberName=memberName;
        this.memberId = memberId;
        this.gender = gender;
        this.age = age;
    }

    //회원정보를 문자열로 만들어서 리턴하는 기능
    String inform(){
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        return String.format("# %d번 | %s | %s | %s | %d세",
                                this.memberId, this.email, this.memberName, this.gender, this.age);
    };
    
}
