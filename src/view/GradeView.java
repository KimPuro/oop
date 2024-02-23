package view;
import java.util.Scanner;

import service.GradeService;
import serviceImpl.GradeServiceImpl;

public class GradeView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어, 영어, 수학 점수를 입력하세요.");
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        GradeServiceImpl gradeService = new GradeServiceImpl();
        int total = gradeService.createTotal(kor, eng, math);
        System.out.println(gradeService.createAvg(total));


    }
}
