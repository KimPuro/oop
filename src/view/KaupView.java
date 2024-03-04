package view;
import model.Member;
import service.KaupService;
import service.UtilService;

import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

public class KaupView {
    public static void main() {
        UtilService util = UtilServiceImpl.getInstance();
        Member person = Member.builder()
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomDouble(50, 100))
                .build();
                KaupService kaup = KaupServiceImpl.getInstance();

                String bmi = kaup.createBmi(person);
                String bodyMass = kaup.createBodyMass(Double.parseDouble(bmi));


        System.out.println("당신의 BMI 지수는 " + bmi + "입니다.");

    }
}
