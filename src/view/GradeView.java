package view;
import java.util.Scanner;

import model.Member;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("이름을 입력하세요");
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        Member student = Member.builder()
                .name(sc.next())
                .build();
        Subject subjects = Subject.builder()
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
