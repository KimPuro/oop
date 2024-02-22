package view;

import serviceImpl.KaupServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게를 입력하세요.");
        double weight = scanner.nextDouble();
        System.out.println("키를 입력하세요.");
        double height = scanner.nextDouble();

        KaupServiceImpl kaupService = new KaupServiceImpl();
        double bmi = kaupService.createBmi(height, weight);

        System.out.println("당신의 BMI 지수는 " + bmi + "입니다.");

    }
}
