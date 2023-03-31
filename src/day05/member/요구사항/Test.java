package day05.member.요구사항;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();

        Member thief = new Member("abc@def.com", "zzzz", "rrr", 1, Gender.FEMALE, 78);

        mr.addMember(thief);
        mr.addMember(thief);

        mr.showMembers();

        boolean flag=mr.isDuplicateEmail("xxx@zzz.com");
        System.out.println("flag = "+flag);
    }
}
