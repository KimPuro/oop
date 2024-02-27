package view;
import controller.UserController;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserController ctrl = new UserController();
        ctrl.addUsers();
        while (true) {
            System.out.println("0-종료, 1-회원가입, 2-로그인, 3-ID 검색, 4-비번변경 " +
                    "5-회원탈퇴, 6-회원목록,7-이름검색, 8-직업검색, 9-회원수");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료합니다.");
                    return;
                    case "1":
                        System.out.println("회원 5명을 추가했습니다.");
                        ctrl.addUsers();
                        break;
                    case "3":
                    System.out.println("검색할 ID를 입력하세요.");
                    String id = sc.next();
                    ctrl.findUser(id);
                    break;

                    case "6":
                    System.out.println("전체 회원 목록을 출력합니다.");
                    ctrl.printUsers();
                    break;
                case "9":
                    System.out.println("회원 수를 출력합니다.");
                    ctrl.countUsers();
                    break;
            }

        }
    }
}