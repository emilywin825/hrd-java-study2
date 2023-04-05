package day08.poly.book;


import day05.member.요구사항.Gender;
import static day05.member.요구사항.Gender.*;
import static day07.util.Utility.*;

public class LibraryView {
//    private static Scanner sc;  -> input() 정의해 놓은 것 있으니까 그거 사용
    private static LibraryRepository repository;

    //static 데이터는 생성자에서 초기화하면 안됨!!!
//    static 필드의 초기화는 static initializer를 사용 -> 우리가 부르는거 아니고 자동호출
    static{
//        sc=new Scanner(System.in);
        repository=new LibraryRepository();
    }

    //회원정보 입력처리
    private  static void makeNewBookUser(){
        System.out.println("# 회원 정보를 입력해주세요.");
        String name=input("# 이름 : ");
        int age= Integer.parseInt(input("# 나이 : "));
        Gender gender=inputGender();

        //입력받은 데이터를 객체로 포장
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);

        //입력받은 유저객체를 저장소로 보내기
        repository.register(userInfo);
    }

    //도서 대여하기
    private static void rentBook(){
        System.out.println();
    }



    //성별 판단
    private static Gender inputGender() {
        while (true) {
            String inputGender= input("성별(M/F) : ");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)){
                case 'M':
                    return MALE;
                case 'F' :
                    return FEMALE;
                default:
                    System.out.println("\n# 성별을 잘못 입력했습니다.");
            }
        }
    }


    //   화면처리
    public static void start(){
        makeNewBookUser();
        
        //메인 메뉴 띄우기
        while (true){
            showMainScreen();
            selectMenu();
        }
    }
    //메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {
        System.out.println("====================== 도서 메뉴 ======================");
        System.out.println("#1. 마이페이지");
        System.out.println("#2. 도서 전체 조회");
        System.out.println("#3. 도서 검색");
        System.out.println("#4. 도서 대여하기");
        System.out.println("#5. 도서 저자 이름으로 검색");
        System.out.println("#9. 프로그램 종료하기");
    }

    //메뉴 번호를 입력받고 분기를 나눠주는 메서드
    private static void selectMenu(){
        String menuNum = input("-메뉴 번호 : ");

        switch (menuNum){
            case "1":
                //마이페이지 : 가입한 회원정보 출력
                //정보(객체) 가져오기
                BookUser user = repository.findBookUser();
                System.out.println("\n******** 회원님 정보 ********");
                System.out.println("# 회원명: " + user.getName());
                System.out.println("# 나이: " + user.getAge());
                System.out.println("# 성별: " + user.getGenderToString());
                System.out.println("# 쿠폰개수: " + user.getCouponCount());
                break;

            case "2":
                String[] infoList= repository.getBookInfoList();
                System.out.println("========== 모든 도서 정보 ==========");
                for(String info : infoList){
                    System.out.println(info);
                }
                break;

            case "3":
                //사용자에게 검색어를 입력받음.
                String keyword=input("#검색어 : ");
                //저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 내노라고 해야함
                String[] bookInfoList= repository.searchBookInfoList(keyword);
                for (String info : bookInfoList) {
                    System.out.println(info);
                }
                break;

            case "4":
                // 대여가능한 책의 목록을 번호와 함께 출력
                String[] rentalList=repository.getBookInfoList();
                System.out.println("============ 대여 도서 목록 ============");
                for (int i = 0; i < rentalList.length; i++) {
                    System.out.println(i+"번째 도서 : "+rentalList[i]);
                }
                int bookNum=Integer.parseInt(input("# 대여할 도서 번호 입력 : "));
                repository.checkBookRent(bookNum);
                break;

//                도서 저자 이름으로 검색
            case "5":
                String author=input("저자의 이름을 입력해 주세요");
                repository.findAuthor(author);
                break;

            case "9":
                System.out.println("# 프로그램을 종료합니다.");
                System.exit(0);
                break;

            default:
                System.out.println("번호를 제대로 입력해주세요");
        }
    }


}
