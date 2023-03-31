package day05.member.요구사항;

//역할 : 회원 저장소 역할
public class MemberRepository {
    Member[] memberList;

    public MemberRepository() {
        this.memberList=new Member[3];
        memberList[0]=new Member("abc@def.com","1234","뽀로로",1,Gender.FEMALE,20);
        memberList[1] = new Member("123@naver.com","aa11","맹구",1,Gender.MALE,50);
        memberList[2] = new Member("16790@daum.com","bb22","바비",1,Gender.MALE,30);
    }


    /** * 모든 회원 정보를 출력해주는 메소드 */
    void showMembers() {
        System.out.printf("==============현재 회원정보 (총 %d명)============\n",memberList.length );

        for(Member m : memberList){
            System.out.println(m.inform());
        }
    }

    /**
     * 회원 가입 기능(push 구현)
     * @param1 - newMember : 새롭게 회원가입하는 회원의 정보
     * @return : 회원가입 성공 여부
     *           성공시 true, 이메일이 중복되어 실패시 false
     * */
     boolean addMember(Member newMember){
         //이메일이 중복인가?
        if(isDuplicateEmail(newMember.email))  return false;

         //실제로 멤버를 추가하는 코드
         Member[] temp = new Member[memberList.length+1];
         for (int i = 0; i < memberList.length; i++) {
             temp[i] = memberList[i];
         }
         temp[temp.length-1] = newMember;
         memberList=temp;
         return true;
     }

     /**
      * 이메일의 중복여부를 확인하는 기능
      * @param1 targetEmail : 검사하는 대상 이메일
      * @return : 중복되었을 시 true, 사용가능할 시 false
     */

     boolean isDuplicateEmail(String targetEmail){
         for(Member m : memberList){
             if(targetEmail.equals(m.email)){
                 return true;
             }
         }
         //중복 x
         return false;
     }

     //마지막 회원의 번호를 알려주는 기능
    int getLastMemberId(){
         return memberList[memberList.length-1].memberId;
    }

    /**  개별회원 정보 조회하는 기능*/
    Member searchMember(String email){
        for (Member member : memberList) {
                if(email.equals(member.email)){
                    return member;
                }
        }
        return null;
    }
}
