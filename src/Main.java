import view.*;
import java.util.Scanner;

public class Main {

    public interface MenuAction {
        void perform(Scanner sc);
    }

    public enum MenuOption {
        EXIT("0", sc -> System.out.println("종료합니다.")),
        SIGN_UP("1", sc -> JoinView.main(sc)),
        MANAGE_USER("2", sc -> UserView.main(sc)),
        BOARD("3", sc -> BoardView.main(sc)),
        KAUP("4", sc -> KaupView.main()),
        CHECK_GRADE("5", sc -> GradeView.main(sc));

        private final String code;
        private final MenuAction action;

        MenuOption(String code, MenuAction action) {
            this.code = code;
            this.action = action;
        }

        public static MenuOption fromCode(String code) {
            for(MenuOption option : values()) {
                if(option.code.equals(code)) {
                    return option;
                }
            }
            return null;
        }

        public void execute(Scanner sc) {
            this.action.perform(sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0-종료, 1-회원가입, 2-회원관리, 3-게시판, 4-카우프 5-성적확인");
            MenuOption.fromCode(sc.next()).execute(sc);
        }
}