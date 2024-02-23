package view;
import java.util.Scanner;

import builder.SubjectBuilder;
import builder.UserBuilder;
import model.MemberDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

public class GradeView {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요");

        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        MemberDto student = new UserBuilder()
                .name(sc.next())
                .build();
        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInt(0, 100))
                .english(util.createRandomInt(0, 100))
                .math(util.createRandomInt(0, 100))
                .build();

        int totalScore = grade.getTotalScore(subjects.getKorean(), subjects.getEnglish(), subjects.getMath());
        double avgScore = grade.findAverage(totalScore);

        System.out.printf(" ====== %s의 성적표 ======\n Korean : %s \n " +
                "English : %s \n Math : %s \n Total : %s \n " +
                "Average : %.1f \n", student.getName(), subjects.getKorean(),
                subjects.getEnglish(),
                subjects.getMath(),
                totalScore, avgScore);


    }
}
