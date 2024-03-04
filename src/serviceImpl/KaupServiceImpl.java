package serviceImpl;

import model.Member;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();
    List<?> kaupList;
    Map<String, ?> kaupMap;

    private KaupServiceImpl() {
        this.kaupList = new ArrayList<>();
        this.kaupMap = new HashMap<>();
    }


    public static KaupService getInstance() {
        return instance;
    }

    @Override
    public String createBmi(Member member) {
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
