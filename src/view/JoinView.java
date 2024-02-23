package view;
import model.MemberDto;
import java.util.Scanner;
import builder.UserBuilder;

public class JoinView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID, 비밀번호, 비밀번호 확인" +
                "이름, 주민번호, 전화번호, 주소, 직업을 입력하세요.");
        MemberDto memberDto = new UserBuilder()
                .username(scanner.next())
                .pw(scanner.next())
                .name(scanner.next())
                .personalId(scanner.next())
                .phoneNumber(scanner.next())
                .address(scanner.next())
                .job(scanner.next())
                .weight(scanner.nextDouble())
                .height(scanner.nextDouble())
                .build()
                ;
        System.out.println(memberDto.toString());
    }
}
