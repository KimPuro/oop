import view.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0-종료, 1-회원가입, 2-회원관리, 3-게시판, 4-카우프 5-성적확인");
        switch (sc.next()) {
            case "0":
                System.out.println("종료합니다.");
                return;
            case "1":
                JoinView.main(sc);
                break;
            case "2":
                UserView.main(sc);
                break;
            case "3":
                BoardView.main(sc);
                break;
            case "4":
                KaupView.main();
                break;
            case "5":
                GradeView.main(sc);
                break;

        }

    }
}