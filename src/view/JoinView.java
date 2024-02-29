package view;
import model.MemberDto;
import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인" +
                "이름, 주민번호, 전화번호, 주소, 직업, 몸무게, 키 순으로 입력하세요.");
        MemberDto memberDto = MemberDto.builder()
                .username(sc.next())
                .pw(sc.next())
                .name(sc.next())
                .personalId(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .weight(sc.nextDouble())
                .height(sc.nextDouble())
                .build()
                ;
        System.out.println(memberDto.toString());
    }
}
