package serviceImpl;

import model.MemberDto;
import service.KaupService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl() {
    }


    public static KaupService getInstance() {
        return instance;
    }

    @Override
    public String createBmi(MemberDto member) {
        double height = member.getHeight();
        double weight = member.getWeight();
        double bmi = weight / ((height * height)/10000);
        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(double bmi) {
        String bodyMass = "";
        if (bmi < 18.5) {
            bodyMass = "저체중";
        } else if (bmi < 23) {
            bodyMass = "정상";
        } else if (bmi < 25) {
            bodyMass = "과체중";
        } else if (bmi < 30) {
            bodyMass = "비만";
        } else {
            bodyMass = "고도비만";
        }
        return bodyMass;

    }
}
