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
                    System.out.println("회원가입할 ID를 입력하세요.");
                    ctrl.joinUser(sc);
                    break;
                case "2":
                    System.out.println("로그인할 ID와 비밀번호를 입력하세요.");
                    ctrl.loginUser(sc);
                    break;
                case "3":
                    System.out.println("검색할 ID를 입력하세요.");
                    ctrl.findUser(sc);
                    break;
                case "4":
                    System.out.println("비밀번호를 변경할 ID와 변경할 비밀번호를 입력하세요.");
                    ctrl.updatePassword(sc);
                    break;
                case "5":
                    System.out.println("탈퇴할 ID를 입력하세요.");
                    ctrl.deleteUser(sc.next());
                    break;
                case "6":
                    System.out.println("전체 회원 목록을 출력합니다.");
                    ctrl.printUsers();
                    break;
                case "7":
                    System.out.println("검색할 이름을 입력하세요.");
                    ctrl.findUsersByName(sc.next());
                    break;
                case "8":
                    System.out.println("검색할 직업을 입력하세요.");
                    ctrl.findUserByJob(sc.next());
                    break;
                case "9":
                    ctrl.countUsers();
                    break;
            }

        }
    }
}